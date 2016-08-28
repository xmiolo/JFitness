package com.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "pessoa", schema = "public")
public class Pessoa {
	
	@Id
	@GeneratedValue
	@Column(name = "cdPessoa",nullable=false, unique=true)
	private Integer cdPessoa;
	@Column(name = "nome")
	private String nome;
	@Column(name = "senha")
	private String senha;
	@Column(name="email")
	private String email;
	@Column(name = "endereco")
	private String endereco;
	@Column(name="cidade")
	private String cidade;
	@Column(name="telefone")
	private String telefone;
	@Column(name="dtNascimento")
	private LocalDate dtNascimento;
	@ManyToOne
	private TipoPessoa tipoPessoa;
	
	
	public Pessoa() {	}

	public Integer getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Integer cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [cdPessoa=" + cdPessoa + ", nome=" + nome + ", senha=" + senha + "]";
	}

}
