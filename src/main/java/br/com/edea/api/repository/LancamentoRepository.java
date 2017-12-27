package br.com.edea.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edea.api.entities.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
