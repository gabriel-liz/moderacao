package com.avaliacomentarios.moderacao.domain.service;

import com.avaliacomentarios.moderacao.api.model.ModeracaoInput;
import com.avaliacomentarios.moderacao.api.model.ModeracaoOutput;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ModeracaoService {


    private static final List<String> PALAVRAS_BANIDAS = List.of("ódio", "xingamento", "php");

    public ModeracaoOutput avaliar(ModeracaoInput request){
        String texto = request.getTexto().toLowerCase();

        Set<String> palavrasBanidasEncontradas = new HashSet<>();
        for(String palavra : PALAVRAS_BANIDAS){
            if(texto.contains(palavra.toLowerCase())){
                palavrasBanidasEncontradas.add(palavra);
            }
        }

        if(!palavrasBanidasEncontradas.isEmpty()){
            return ModeracaoOutput.builder()
                    .aprovado(false)
                    .motivo("Contém palavras proibidas: " + palavrasBanidasEncontradas)
                    .build();
        }

        return ModeracaoOutput.builder()
                .aprovado(true)
                .motivo("Comentário aprovado não tem palavras proibidas")
                .build();
    }
}
