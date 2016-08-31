package com.controller;

import com.dao.PessoaDAO;
import com.model.Pessoa;

public class LoginController {

	private static PessoaDAO pessoaDAO;

	public LoginController() {
		super();
		pessoaDAO = new PessoaDAO();
	}
	
	public boolean autenticarPessoa(Pessoa pessoa){
		return pessoaDAO.getAutenticacao(pessoa.getEmail(), pessoa.getSenha());
	}
}
