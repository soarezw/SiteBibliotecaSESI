package com.sesisenai.biblioteca.entity;

public class LoginRequest {
    private String cpf;  // Campo genérico para CPF ou email
    private String senha;       // Senha

    // Getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpfOuEmail(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}