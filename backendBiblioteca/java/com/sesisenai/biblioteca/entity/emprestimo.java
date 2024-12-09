package com.sesisenai.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_emprestimo")

public class emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id_emprestimo;

	@Column(name = "dataEmprestimo")
	private LocalDate dataEmprestimo;

	@Column(name = "dataDevolucao")
	private LocalDate dataDevolucao;

	@ManyToOne
	@JoinColumn(name = "ALUNO_id_aluno")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "LIVRO_id_livro")
	private Livro livro;

	public Long getId_emprestimo() {
		return id_emprestimo;
	}

	public void setId_emprestimo(Long id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Usuario getCpf() {
		return usuario;
	}

	public void setCpf(Usuario cpf) {
		this.usuario = cpf;
	}

	public Livro getIsbn() {
		return livro;
	}

	public void setIsbn(Livro isbn) {
		this.livro = isbn;
	}

}