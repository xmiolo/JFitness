package com.dao;

import com.model.TipoPessoa;

public class TipoPessoaDAO extends GenericDAO<TipoPessoa, Long> {
	
	
	public TipoPessoaDAO() {
		super(TipoPessoa.class);
		try {
			this.setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/*public List<TipoPessoa> getList(){
		return getList();
	}*/
	
}
