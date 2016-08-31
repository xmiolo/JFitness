package com.model;

import java.time.LocalDate;

import javax.persistence.*;

@NamedNativeQueries({
		@NamedNativeQuery(name = "autenticaPessoa", query = "select * from pessoa where email = :email and senha = md5(:senha) ", resultClass = Pessoa.class) })
@Entity
@Table(name = "pessoa", schema = "public")
public class Pessoa {

	@Id
	@GeneratedValue
	@Column(name = "cdPessoa", nullable = false, unique = true)
	private Integer cdPessoa;
	@Column(name = "nome")
	private String nome;
	@Column(name = "senha")
	private String senha;
	@Column(name = "email")
	private String email;
	@Column(name = "endereco")
	private String endereco;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cdcidade")
	private Cidade cidade;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "dtNascimento")
	private LocalDate dtNascimento;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cdtipo")
	private TipoPessoa tipoPessoa;

	public Pessoa() {
	}

	/**
	 * @return the cidade
	 */
	public Cidade getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the cdPessoa
	 */
	public Integer getCdPessoa() {
		return cdPessoa;
	}

	/**
	 * @param cdPessoa
	 *            the cdPessoa to set
	 */
	public void setCdPessoa(Integer cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the dtNascimento
	 */
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	/**
	 * @param dtNascimento
	 *            the dtNascimento to set
	 */
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	/**
	 * @return the tipoPessoa
	 */
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	/**
	 * @param tipoPessoa
	 *            the tipoPessoa to set
	 */
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [cdPessoa=" + cdPessoa + ", nome=" + nome + ", senha=" + senha + "]";
	}

}
