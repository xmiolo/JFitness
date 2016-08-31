package com.utils;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ChamaTela {
	
	private Parent ROOT;
	private Stage NEWSTAGE;
	private Scene SCENE;
	
	public ChamaTela(){}
	/**
	 * 
	 * @param resource (.fxml a ser carregado) 
	 * @param stage (.getStage().getWindow() de algum componente)
	 * @param title (String titulo da tela)
	 * @param resizable 
	 */
	public void Montar(String resource, Window stage, String title, boolean resizable, boolean maximized){
		try {
			ROOT = FXMLLoader.load(ChamaTela.class.getResource("../fxml/"+resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
		NEWSTAGE = (Stage) stage;
		SCENE = new Scene(ROOT);
		SCENE.getStylesheets().add("fextile.css");
		NEWSTAGE.setTitle(title);
		NEWSTAGE.setScene(SCENE);
		NEWSTAGE.setResizable(resizable);
		NEWSTAGE.setMaximized(false);
		NEWSTAGE.setMaximized(maximized);
		NEWSTAGE.show();
	}
	
}
