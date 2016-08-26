package com;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.model.Pessoa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicializa extends Application {

	public static void main(String[] args) {
		//launch();
			List<Pessoa> list= null;
			
			SessionFactory sessions = new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessions.openSession();
			
			try {
				session.beginTransaction();
				list = session.createQuery("select * from pessoa msg").list();
				session.getTransaction().commit();
				
				for (Pessoa msg : list) {
					System.out.println(msg.getNome());
				}

			} catch ( HibernateException e ) {
				if ( session.getTransaction() != null )
					session.getTransaction().rollback();
			} finally {
				session.close();
			}
					
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml/telaLogin.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("fextile.css");
		stage.setTitle("JFitness - Acesso");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
}
