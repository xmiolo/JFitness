package com.controller;

import com.dao.PessoaDAO;
import com.model.Pessoa;

public class LoginController {

	private PessoaDAO pessoaDAO;

	public LoginController() {
		this.pessoaDAO = new PessoaDAO();
	}
	
	public void autenticarPessoa(Pessoa pessoa){
		if(this.pessoaDAO.autenticarPessoa(pessoa)){
			System.out.println("LoginController|Anteticado!");
		} else {
			System.out.println("LoginController|Não autenticou!");
		}

	}
}
