package com.fxml;

import java.io.IOException;

import com.model.PessoaAutenticada;
import com.utils.ChamaTela;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuPrincipal {
	

	@FXML
	private Button btnPessoas;
	
	
	public void menuPessoas() throws IOException{
		ChamaTela chamaTela = new ChamaTela();
		chamaTela.Montar("cadPessoas.fxml", btnPessoas.getScene().getWindow(), "JFitness - Cadastro de Pessoas", false, false);
		System.out.println(PessoaAutenticada.getPessoa().getNome());
	}
	
	
	
}
