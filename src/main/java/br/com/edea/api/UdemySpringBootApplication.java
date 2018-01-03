package br.com.edea.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.edea.api.entities.Empresa;
import br.com.edea.api.entities.Usuario;
import br.com.edea.api.enums.PerfilEnum;
import br.com.edea.api.repository.EmpresaRepository;
import br.com.edea.api.repository.UsuarioRepository;
import br.com.edea.api.utils.PasswordUtils;

@SpringBootApplication
public class UdemySpringBootApplication {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Value("${pagination.itensPerPage}")
	private int itensPerPage;

	public static void main(String[] args) {
		SpringApplication.run(UdemySpringBootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args-> {
			//System.out.println("### Quantidade de elementos por página: " + this.itensPerPage);
			
			String encodedPassword = PasswordUtils.generateBCrypt("12345678");
			System.out.println("Encoded password: " + encodedPassword);
			
			encodedPassword = PasswordUtils.generateBCrypt("12345678");
			System.out.println("Encoded password again: " + encodedPassword);
			
			System.out.println("Valid password:" + PasswordUtils.passwordValidation("12345678", encodedPassword));
			
			//repositoryTest();
			
			createUsers();
		};
	}
	
	public void createUsers() {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("usuario@email.com");
		usuario.setPerfil(PerfilEnum.ROLE_USUARIO);
		usuario.setSenha(PasswordUtils.generateBCrypt("123456"));
		this.usuarioRepository.save(usuario);
		
		Usuario admin = new Usuario();
		admin.setEmail("admin@email.com");
		admin.setPerfil(PerfilEnum.ROLE_ADMIN);
		admin.setSenha(PasswordUtils.generateBCrypt("123456"));
		this.usuarioRepository.save(admin);
	}
	
	public void repositoryTest() {
		
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("edeaTech Consultoria Web");
		empresa.setCnpj("74645215000104");
		
		this.empresaRepository.save(empresa);
		
		List<Empresa> empresas = empresaRepository.findAll();
		empresas.forEach(System.out::println);
	}
}
