package br.edu.unicesumar.crud.model.domain;

import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name = "es_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    @NonNull
    private String nome;
    @NonNull
    private int idade;


    public Paciente(Integer idPaciente, String nome, int idade) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.idade = idade;
    }

    public Paciente(){}

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
