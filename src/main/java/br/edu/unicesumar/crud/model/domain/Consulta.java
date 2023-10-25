package br.edu.unicesumar.crud.model.domain;

import br.edu.unicesumar.crud.model.domain.enums.Equipamentos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NonNull;

import java.time.LocalDate;

    //Consulta realizada antes da consultaEquipamento
public class Consulta {
    @NonNull
    private LocalDate dataConsulta;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsulta;
    @NonNull
    private Medico medico;
    @NonNull
    private Paciente paciente;
    @NonNull
    private Equipamentos equipamentos;

    public Consulta(LocalDate dataConsulta, Integer idConsulta, Medico medico, Paciente paciente, Equipamentos equipamentos) {
        this.dataConsulta = dataConsulta;
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
        this.equipamentos = equipamentos;
    }

    public Consulta(){}

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Equipamentos getEquipamentos(){ return equipamentos; }



}
