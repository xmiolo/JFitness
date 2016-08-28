package com.controller;

import com.dao.PessoaDAO;
import com.model.Pessoa;

public class LoginController {

	private static PessoaDAO pessoaDAO;

	public LoginController() {
		super();
		this.pessoaDAO = pessoaDAO.getInstance();
	}
	
	public boolean autenticarPessoa(Pessoa pessoa){
		return this.pessoaDAO.getAutenticacao(pessoa.getEmail(), pessoa.getSenha());
	}
}
