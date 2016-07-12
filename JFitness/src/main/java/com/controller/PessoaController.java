package com.controller;

import com.dao.PessoaDAO;
import com.model.Pessoa;

public class PessoaController {
	private PessoaDAO pessoaDAO;
	
	public PessoaController() {
		this.pessoaDAO = new PessoaDAO();
	}


	public void novaPessoa(Pessoa pessoa){
		if(pessoaDAO.persistirPessoa(pessoa)){
			System.out.println("PessoaController|Inseriu a pessoa: "+pessoa.getNome());
		}
	}
}
