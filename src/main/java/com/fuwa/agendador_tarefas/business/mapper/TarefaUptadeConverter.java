package com.fuwa.agendador_tarefas.business.mapper;

import com.fuwa.agendador_tarefas.business.dto.TarefasDTO;
import com.fuwa.agendador_tarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUptadeConverter {
    void uptadeTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
