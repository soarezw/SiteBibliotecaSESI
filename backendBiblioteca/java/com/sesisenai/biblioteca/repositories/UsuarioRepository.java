package com.sesisenai.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesisenai.biblioteca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, String> {
	Usuario findByCpf(String cpf);
	
}
