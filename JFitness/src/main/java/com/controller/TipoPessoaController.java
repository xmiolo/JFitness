package com.controller;

import java.util.List;

import com.dao.PessoaDAO;
import com.dao.TipoPessoaDAO;
import com.model.Pessoa;
import com.model.TipoPessoa;

public class TipoPessoaController {
	private TipoPessoaDAO tipopessoaDAO;
	
	public TipoPessoaController() {
		tipopessoaDAO = new TipoPessoaDAO();
	}

	public List<TipoPessoa> listTipoPessoa(){
		return tipopessoaDAO.getList();
	}
}
