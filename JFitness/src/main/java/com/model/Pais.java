package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais", schema = "public")
public class Pais {
	@Id
	@GeneratedValue
	@Column(nullable=false, unique=true)
	private Integer cdPais;
	private String nome;
	private String sigla;

	public Pais() {
	}

	/**
	 * @return the cdPais
	 */
	public Integer getCdPais() {
		return cdPais;
	}

	/**
	 * @param cdPais
	 *            the cdPais to set
	 */
	public void setCdPais(Integer cdPais) {
		this.cdPais = cdPais;
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
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla
	 *            the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nome;
	}

}
