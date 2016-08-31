package com.fxml;

import org.jboss.jandex.Main;

import com.Inicializa;
import com.controller.LoginController;
import com.model.Pessoa;
import com.utils.ChamaTela;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaLogin {
	
	public void setMain(){
		Inicializa.main(null);
	}
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
			ChamaTela chamaTela = new ChamaTela();
			chamaTela.Montar("menuPrincipal.fxml", btnEntrar.getScene().getWindow(), "JFitness - Menu", false, false);
		}
		
	}
}
