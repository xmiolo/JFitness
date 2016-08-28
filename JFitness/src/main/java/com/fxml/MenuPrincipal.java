package com.fxml;

import com.model.PessoaAutenticada;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MenuPrincipal {
	
	@FXML
	private Button btBotao;

	public void start(Stage stage){
		
		
		stage.setTitle("Segunda janela");
        StackPane sp = new StackPane();
        Scene sc = new Scene(sp,300,300);
        stage.setScene(sc);
        stage.show();
        
	}
	
	
}
