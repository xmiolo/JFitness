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
	private ComboBox<String> comboTipoPessoa = new ComboBox<String>();

	private TipoPessoaController tpPessoaController;

	
	public CadPessoas() {
	}


	@FXML
    private void initialize() {
		tpPessoaController = new TipoPessoaController();
		comboTipoPessoa.getItems().clear();
		System.out.println(tpPessoaController.listTipoPessoa());
		// FXCollections.observableArrayList(tipoPessoaDAO.getList())
		// FXCollections.observableArrayList()

		comboTipoPessoa.getItems().addAll(FXCollections.observableArrayList("1", "2"));
	}
	
}
