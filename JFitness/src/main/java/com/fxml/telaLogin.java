package com.fxml;

import com.controller.LoginController;
import com.model.Pessoa;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Aten��o");
		alert.setHeaderText("");
		alert.setContentText("Usu�rio ou senha Inv�lido!\nFavor verificar.");
		
		LoginController lController = new LoginController();
		if(!lController.autenticarPessoa(pessoa)){
			alert.show();
		}
		
	}
}
