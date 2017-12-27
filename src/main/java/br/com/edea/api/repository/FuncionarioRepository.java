package br.com.edea.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edea.api.entities.Funcionario;

public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long> {

}
