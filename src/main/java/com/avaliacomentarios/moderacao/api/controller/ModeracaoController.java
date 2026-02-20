package com.avaliacomentarios.moderacao.api.controller;

import com.avaliacomentarios.moderacao.api.model.ModeracaoInput;
import com.avaliacomentarios.moderacao.api.model.ModeracaoOutput;
import com.avaliacomentarios.moderacao.domain.service.ModeracaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moderacao")
@RequiredArgsConstructor
public class ModeracaoController {

    private final ModeracaoService moderacaoService;

    @PostMapping
    public ModeracaoOutput avaliar(@RequestBody ModeracaoInput request){
        return moderacaoService.avaliar(request);
    }
}
