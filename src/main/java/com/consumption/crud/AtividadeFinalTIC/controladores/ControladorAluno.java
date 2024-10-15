package com.consumption.crud.AtividadeFinalTIC.controladores;

import com.consumption.crud.AtividadeFinalTIC.modelo.ModeloAluno;
import com.consumption.crud.AtividadeFinalTIC.repositorios.RepositorioAluno;
import com.consumption.crud.ProjetoGuiado.models.PessoaModel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin("*")
@AllArgsConstructor

public class ControladorAluno {
    private RepositorioAluno repositorioAluno;

    @GetMapping
    public ResponseEntity<List<ModeloAluno>> pegaTodosAlunos() {
        return new ResponseEntity<>(repositorioAluno.findAll(), HttpStatus.OK);
    } /// Retornando todos os alunos cadastrados.

    @PostMapping
    public ResponseEntity<ModeloAluno> criaAluno(@RequestBody ModeloAluno novaPessoa) {
        novaPessoa.setId(null); // Garantindo que a nova pessoa está sem Id para que o JPA entenda que é para criar uma nova pessoa
        return new ResponseEntity<>(repositorioAluno.save(novaPessoa), HttpStatus.OK);
    } /// Criando um novo cadastro de aluno.

    @PutMapping
    public ResponseEntity<ModeloAluno> editaAluno(@RequestBody ModeloAluno novaPessoa) {
        return new ResponseEntity<>(repositorioAluno.save(novaPessoa), HttpStatus.OK);
    } /// Atualizando um aluno existente

    @PatchMapping

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletaAluno(@PathVariable Integer id) {
        repositorioAluno.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } /// Remove um aluno pelo seu id
}
