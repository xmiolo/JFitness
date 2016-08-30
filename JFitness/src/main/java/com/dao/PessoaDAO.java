package com.dao;

import java.util.Iterator;
import java.util.List;

import com.model.Pessoa;
import com.model.PessoaAutenticada;

public class PessoaDAO extends GenericDAO<Pessoa, Long> {
	
	public PessoaDAO() {
		super(Pessoa.class);
		try {
			this.setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public boolean getAutenticacao(final String email,final String senha) {
		
		List<Pessoa> query = this.entityManager.createNamedQuery("autenticaPessoa")
				.setParameter("email", email)
				.setParameter("senha", senha)
				.getResultList();
		Iterator<Pessoa> it = query.iterator();
		if(it.hasNext()){
			PessoaAutenticada.getPessoaAutenticada();
			PessoaAutenticada.setPessoa(it.next());
			return true;
		} 
		return false;
	}
	
}
