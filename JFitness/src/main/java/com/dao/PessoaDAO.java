package com.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

import com.model.Pessoa;
import com.model.PessoaAutenticada;

public class PessoaDAO extends GenericDAO<Pessoa, Long> {
	private static PessoaDAO INSTANCE;
	
	public static PessoaDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PessoaDAO();
		}
		
		return INSTANCE;
	}
	
	public PessoaDAO() {
		super(Pessoa.class);
		
	}

	@SuppressWarnings("unchecked")
	public boolean getAutenticacao(final String email,final String senha) {
		this.getSession().beginTransaction();
		
		SQLQuery query = this.getSession().createSQLQuery("select * from pessoa where email = '"+email+"' and senha = md5('"+senha+"')");
		query.addEntity(Pessoa.class);
		List<Pessoa> result = query.list();
		this.getSession().close();
		for(Pessoa pes : result){
			PessoaAutenticada.getPessoaAutenticada();
			PessoaAutenticada.setPessoa(pes);
		}
		if(result.isEmpty()){
			return false;
		}else {
			return true;
		}
	}
	
}
