package com.sesisenai.biblioteca.entity;

public class LoginResponse {
	private boolean success;
	private String message;
	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	private TipoUsuario id_tipos;

	// Construtores
	public LoginResponse() {

	}

	public LoginResponse(boolean success, String message, String cpf, String nome, String email, String telefone,
			TipoUsuario id_tipos) {
		this.success = success;
		this.message = message;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.id_tipos = id_tipos;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoUsuario getId_tipos() {
		return id_tipos;
	}

	public void setId_tipos(TipoUsuario id_tipos) {
		this.id_tipos = id_tipos;
	}
}
