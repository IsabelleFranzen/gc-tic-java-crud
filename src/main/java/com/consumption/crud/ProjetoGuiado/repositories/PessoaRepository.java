package com.consumption.crud.ProjetoGuiado.repositories;

import com.consumption.crud.ProjetoGuiado.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {
}
