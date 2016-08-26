package com.utils;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ChamaTela {
	
	private static Parent root;
	private static Stage stageBuild;
	private static Scene scene;
	
	public ChamaTela(){}
	
	public static void Montar(String resource, Window stage, String title, boolean resizable){
		
		try {
			root = FXMLLoader.load(ChamaTela.class.getResource("../fxml/"+resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
		stageBuild = (Stage) stage;
		scene = new Scene(root);
		
		stageBuild.setTitle(title);
		stageBuild.setScene(scene);
		stageBuild.setResizable(resizable);
		stageBuild.show();
	}
}
