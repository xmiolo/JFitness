package com.fxml;


import com.model.TipoPessoa;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CadPessoas {
	
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtDtNasc;
	@FXML
	private TextField txtEndereco;
	@FXML
	private TextField txtCidade;
	@FXML
	private ComboBox<TipoPessoa> comboTipoPessoa;
	
	
}
