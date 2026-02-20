package com.avaliacomentarios.moderacao.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModeracaoOutput {

    private UUID comentarioId;
    private Boolean aprovado;
    private String motivo;

    public boolean aprovado() {
        return Boolean.TRUE.equals(getAprovado());
    }
}
