package br.edu.unicesumar.crud.model.domain;

import br.edu.unicesumar.crud.model.domain.enums.Equipamentos;

import java.time.LocalDate;

public class ConsultaEquipamento extends Consulta{
    public ConsultaEquipamento(LocalDate dataConsulta, Integer idConsulta, Medico medico, Paciente paciente, Equipamentos equipamentos) {
        super(dataConsulta, idConsulta, medico, paciente, equipamentos);
    }

    public ConsultaEquipamento() {
    }
}
