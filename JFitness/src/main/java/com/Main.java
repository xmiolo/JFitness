package com;

import com.controller.LoginController;
import com.controller.PessoaController;
import com.model.Pessoa;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setEmail("gregori@gmail.com");
		pessoa.setSenha("123");
		
		/*PessoaController pController = new PessoaController();
		pController.novaPessoa(pessoa);*/
		LoginController lController = new LoginController();
		lController.autenticarLogin(pessoa);
	}
}
