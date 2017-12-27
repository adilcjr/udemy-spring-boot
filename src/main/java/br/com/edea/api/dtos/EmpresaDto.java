package br.com.edea.api.dtos;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

public class EmpresaDto {
	
	private Long id;
	
	@NotEmpty(message="Razão social não pode ser vazia.")
	@Length(min=5, max=200, message="Razão social deve conter entre 5 e 200 caracteres.")
	private String razaoSocial;
	
	@NotEmpty(message="CNPJ não pode ser vazio.")
	@CNPJ(message="CNPJ Inválido.")
	private String cnpj;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
