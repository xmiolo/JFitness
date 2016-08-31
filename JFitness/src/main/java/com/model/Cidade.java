package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cidade", schema = "public")
public class Cidade {
	@Id
	@GeneratedValue
	@Column(nullable=false, unique=true)
	private Integer cdCidade;
	private String nome;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cdestado", nullable=false)
	private Estado estado;

	public Cidade() {
	}

	/**
	 * @return the cdCidade
	 */
	public Integer getCdCidade() {
		return cdCidade;
	}

	/**
	 * @param cdCidade
	 *            the cdCidade to set
	 */
	public void setCdCidade(Integer cdCidade) {
		this.cdCidade = cdCidade;
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
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nome;
	}

}
