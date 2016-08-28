package com.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

import com.model.Pessoa;
import com.model.PessoaAutenticada;
import com.model.TipoPessoa;

public class TipoPessoaDAO extends GenericDAO<TipoPessoa, Long> {
	private static TipoPessoaDAO INSTANCE;
	
	public static TipoPessoaDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TipoPessoaDAO();
		}
		
		return INSTANCE;
	}
	
	public TipoPessoaDAO() {
		super(TipoPessoa.class);
		
	}

	
	/*public List<TipoPessoa> getList(){
		return getList();
	}*/
	
}
