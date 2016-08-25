package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicializa extends Application {

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml/telaLogin.fxml"));

		Scene scene = new Scene(root);

		stage.setTitle("JFitness - Acesso");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
}
