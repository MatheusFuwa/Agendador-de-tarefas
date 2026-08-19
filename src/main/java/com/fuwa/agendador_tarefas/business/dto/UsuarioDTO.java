package com.fuwa.agendador_tarefas.business.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UsuarioDTO {
    public String email;
    public String senha;
}
