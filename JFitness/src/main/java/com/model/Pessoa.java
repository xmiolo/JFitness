package com.model;

public class Pessoa {
	
	private Integer cdPessoa;
	private String nome;
	private String senha;
	private String email;
	private String endereco;
	private String cidade;
	
	public Pessoa() {
	}
	
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

	@Override
	public String toString() {
		return "Pessoa [cdPessoa=" + cdPessoa + ", nome=" + nome + ", senha=" + senha + "]";
	}
	
}
