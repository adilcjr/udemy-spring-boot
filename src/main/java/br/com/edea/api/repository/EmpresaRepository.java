package br.com.edea.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edea.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	public Empresa findByCnpj(String cnpj);
	
	
}
