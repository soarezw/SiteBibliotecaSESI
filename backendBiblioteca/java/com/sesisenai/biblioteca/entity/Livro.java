package com.sesisenai.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {

	@Id
	private String isbn;


	@Column(name = "nome")
	private String nome;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "alugado")
	private boolean alugado;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "imagem")
	private String imagem;

	public Livro() {
	}

	public Livro( String isbn, String nome, String categoria, boolean alugado, String descricao,
			String imagem) {
		this.isbn = isbn;
		this.nome = nome;
		this.categoria = categoria;
		this.alugado = alugado;
		this.descricao = descricao;
		this.imagem = imagem;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
