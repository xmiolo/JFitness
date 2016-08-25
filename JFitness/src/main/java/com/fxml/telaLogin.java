package com.fxml;

import com.controller.LoginController;
import com.model.Pessoa;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class telaLogin {

	@FXML
	private TextField txtLogin;
	@FXML
	private TextField txtSenha;
	@FXML
	private Button btnEntrar;
	
	
	public void validarAcesso(){
		Pessoa pessoa = new Pessoa();
		pessoa.setEmail(txtLogin.getText());
		pessoa.setSenha(txtSenha.getText());
		
		LoginController lController = new LoginController();
		lController.autenticarPessoa(pessoa);
	}
}
