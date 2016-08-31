package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estado", schema = "public")
public class Estado {
	@Id
	@GeneratedValue
	@Column(nullable=false, unique=true)
	private Integer cdEstado;
	private String nome;
	private String sigla;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cdpais", nullable=false)
	private Pais pais;

	public Estado() {	}

	/**
	 * @return the cdEstado
	 */
	public Integer getCdEstado() {
		return cdEstado;
	}

	/**
	 * @param cdEstado
	 *            the cdEstado to set
	 */
	public void setCdEstado(Integer cdEstado) {
		this.cdEstado = cdEstado;
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

	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nome;
	}

}
