package com.controller;

import com.dao.PessoaDAO;
import com.model.Pessoa;

public class LoginController {

	private PessoaDAO pessoaDAO;

	public LoginController() {
		this.pessoaDAO = new PessoaDAO();
	}
	
	public boolean autenticarPessoa(Pessoa pessoa){
		return this.pessoaDAO.autenticarPessoa(pessoa.getEmail(), pessoa.getSenha());
	}
}
