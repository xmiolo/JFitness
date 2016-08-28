package com.fxml;

import java.io.IOException;
import java.util.logging.Level;

import com.controller.LoginController;
import com.model.Pessoa;
import com.sun.javafx.logging.Logger;
import com.utils.ChamaTela;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaLogin {

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
		alert.setTitle("Atenção");
		alert.setHeaderText("");
		alert.setContentText("Usuário ou senha Inválido!\nCorrija e tente novamente.");
		
		LoginController lController = new LoginController();
		if(!lController.autenticarPessoa(pessoa)){
			alert.show();
		} else {
			ChamaTela.Montar("menuPrincipal.fxml", btnEntrar.getScene().getWindow(), "JFitness - Menu", false, true);
		}
		
	}
}
