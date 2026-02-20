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
public class ModeracaoInput {

    private UUID comentarioId;
    private String texto;
}
