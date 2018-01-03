package br.com.edea.api.service;

import java.util.Optional;

import br.com.edea.api.entities.Usuario;

public interface UsuarioService {
	
	Optional<Usuario> buscarPorEmail(String email);

}
