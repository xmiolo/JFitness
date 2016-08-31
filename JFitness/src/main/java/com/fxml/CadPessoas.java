package com.fxml;

import java.net.URL;
import java.util.ResourceBundle;

import com.controller.TipoPessoaController;
import com.dao.TipoPessoaDAO;
import com.model.Cidade;
import com.model.TipoPessoa;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadPessoas {

	
	@FXML
	private Button btnFoto;
	@FXML
	private TextField txtNome;
	@FXML
	private DatePicker datePiker;
	@FXML
	private TextField txtEndereco;
	@FXML
	private TextField txtTelefone;
	@FXML
	private ComboBox<Cidade> comboCidade;
	@FXML
	private ComboBox<TipoPessoa> comboTipoPessoa = new ComboBox<TipoPessoa>();

	private TipoPessoaController tpPessoaController;

	
	public CadPessoas() {
	}


	@FXML
    private void initialize() {
		//System.out.println("aisdAHSDUIHASUIDHASUIh");
		tpPessoaController = new TipoPessoaController();
		comboTipoPessoa.getItems().addAll(tpPessoaController.listTipoPessoa());
	}
	
}
