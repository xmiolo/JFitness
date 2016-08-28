package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TipoPessoa", schema = "public")
public class TipoPessoa {
	
	@Id
	@GeneratedValue
	@Column(name = "cdTipo",nullable=false, unique=true)
	private Integer cdTipo;
	@Column(name = "tipo")
	private String tipo;
	
	
	public TipoPessoa() {	}
	
	public Integer getCdTipo() {
		return cdTipo;
	}
	public void setCdTipo(Integer cdTipo) {
		this.cdTipo = cdTipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "TipoPessoa [cdTipo=" + cdTipo + ", tipo=" + tipo + "]";
	}
}
