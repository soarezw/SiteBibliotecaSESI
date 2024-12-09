package com.sesisenai.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesisenai.biblioteca.entity.LoginRequest;
import com.sesisenai.biblioteca.entity.LoginResponse;
import com.sesisenai.biblioteca.entity.ResponseMessage;
import com.sesisenai.biblioteca.entity.Usuario;
import com.sesisenai.biblioteca.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository tb_usuario;

	@GetMapping
	public List<Usuario> findAll() {
		List<Usuario> listaUsuario = tb_usuario.findAll();
		return listaUsuario;
	}

	@GetMapping(value = "/{cpf}")
	public Usuario findById(@PathVariable String cpf) {
		return tb_usuario.findById(cpf).get();
	}

	@PostMapping
	public Usuario insert(@RequestBody Usuario obj) {
		return obj = tb_usuario.save(obj);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String cpf) {
		tb_usuario.deleteById(cpf);
	}

	public Usuario autenticarPorCpf(String cpf, String senha) {
		Usuario usuario = tb_usuario.findByCpf(cpf);
		if (usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
		String cpf = loginRequest.getCpf();
		String senha = loginRequest.getSenha();

		Usuario usuario = null;

		if (cpf.length() == 11 && cpf.matches("[0-9]+")) {

			usuario = autenticarPorCpf(cpf, senha);
		}

		// Se o usuário for encontrado
		if (usuario != null) {new LoginResponse(true, "Login bem-sucedido", usuario.getCpf(), usuario.getNome(), 
				usuario.getEmail(), usuario.getTelefone(), usuario.getId_tipo()); 
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body(new ResponseMessage(false, "Credenciais inválidas"));
		}
		return null;
	}

}
