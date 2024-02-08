package br.edu.unicesumar.crud.model.domain;

import br.edu.unicesumar.crud.model.domain.enums.Equipamentos;
import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name = "es_consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;
    @NonNull
    private Medico medico;
    @NonNull
    private Paciente paciente;
    @NonNull
    private Equipamentos equipamentos;

    public Consulta(Long idConsulta, Medico medico, Paciente paciente, Equipamentos equipamentos) {
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
        this.equipamentos = equipamentos;
    }

    public Consulta(Long idConsulta, Paciente paciente, Medico medico){}

    public Consulta() {

    }

    public Long getIdConsulta() {
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

    public Consulta save(Consulta pacienteNovo) {
            return null;
        }
    }
