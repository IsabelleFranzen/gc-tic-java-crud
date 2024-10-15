package com.consumption.crud.AtividadeFinalTIC.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alunos")

public class ModeloAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer idAluno;
    private String nomeAluno;
    private String sobrenomeAluno;
    private String emailAluno;
    private String cpfAluno;
    private Integer rgAluno;

    public void setId(Object o) {
    }
}
