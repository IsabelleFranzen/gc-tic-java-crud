/*Neste desafio, você terá que criar uma API de gerenciamento de alunos! Ela precisa gerenciar:
Id do aluno; Nome do aluno; Sobrenome do aluno; Email do aluno; CPF do aluno; RG do aluno.
Detalhes técnicos da API:
Precisará do PostgresSQL instalado,
com usuário postgres e a senha admin. Esse é o padrão que viemos utilizando.
Precisará aceitar quatro métodos de requisição: GET, POST, PUT, PATCH* e DELETE.
Após finalizar esse desafio prático, responda às 5 questões a seguir.
*/
package com.consumption.crud.AtividadeFinalTIC.repositorios;

import com.consumption.crud.AtividadeFinalTIC.modelo.ModeloAluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAluno extends JpaRepository<ModeloAluno, Integer> {
}
