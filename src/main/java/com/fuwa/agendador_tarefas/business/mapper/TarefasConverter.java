package com.fuwa.agendador_tarefas.business.mapper;

import com.fuwa.agendador_tarefas.business.dto.TarefasDTO;
import com.fuwa.agendador_tarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);
    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
