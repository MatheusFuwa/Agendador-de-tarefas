package com.fuwa.agendador_tarefas.business;

import com.fuwa.agendador_tarefas.business.dto.TarefasDTO;
import com.fuwa.agendador_tarefas.business.mapper.TarefasConverter;
import com.fuwa.agendador_tarefas.infraestructure.entity.TarefasEntity;
import com.fuwa.agendador_tarefas.infraestructure.enums.StatusNotificacaoEnum;
import com.fuwa.agendador_tarefas.infraestructure.repository.TarefasRepository;
import com.fuwa.agendador_tarefas.infraestructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class TarefaService {
    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;


    public TarefasDTO GravarTarefa(String token, TarefasDTO dto){
        String email= jwtUtil.extractUsername(token.substring(7));
        dto.setEmailusuario(email);
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        TarefasEntity entity = tarefasConverter.paraTarefaEntity(dto);
        return tarefasConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }

    public List<TarefasDTO> buscaTarefasAgendadasPorPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal){
        return tarefasConverter.paraListaTarefasDTO(
                tarefasRepository.findByDataEventoBetween(dataInicial, dataFinal));
    }

    public List<TarefasDTO> BuscaTarefasPorEmail(String token){
        String email = jwtUtil.extractUsername(token.substring(7));
        return tarefasConverter.paraListaTarefasDTO(tarefasRepository.findByemailusuario(email));
    }

}
