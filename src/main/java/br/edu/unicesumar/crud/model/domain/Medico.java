package br.edu.unicesumar.crud.model.domain;

import br.edu.unicesumar.crud.model.domain.enums.Especializacao;
import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name = "es_medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;
    @NonNull
    private String nome;
    @NonNull
    private int idade;

    @NonNull
    private Especializacao especializacao;

    public Medico(String nome, int idade, Long idMedico, Especializacao especializacao) {
        this.nome = nome;
        this.idade = idade;
        this.idMedico = idMedico;
        this.especializacao = especializacao;
    }

    public Medico(){}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }
}
