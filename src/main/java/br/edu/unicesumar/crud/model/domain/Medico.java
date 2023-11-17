package br.edu.unicesumar.crud.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "es_medico")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Long idMedico;
    @NonNull
    @Column(name = "nome")
    private String nome;
    @NonNull
    @Column(name = "idade")
    private Integer idade;

}
