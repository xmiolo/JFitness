package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conexao.ConexaoJDBCFactory;
import com.model.Pessoa;
import com.sql.SQLUtils;

public class PessoaDAO {
	private Connection conn = new ConexaoJDBCFactory().getConexao();
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public PessoaDAO() {}

	public boolean persistirPessoa(Pessoa pessoa) {
		try {
			
			preparedStatement = conn.prepareStatement(SQLUtils.SQL_INSERT_PESSOA);
			preparedStatement.setInt(1, pessoa.getCdPessoa());
			preparedStatement.setString(2, pessoa.getNome());
			preparedStatement.setString(3, pessoa.getSenha());
			preparedStatement.setString(4, pessoa.getEmail());
			preparedStatement.setString(5, pessoa.getEndereco());
			preparedStatement.setString(6, pessoa.getCidade());
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("PessoaDAO|persistirPessoa|erro ao inserir");
			e.printStackTrace();
			
		}
		finally {
			try {
				preparedStatement.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("PessoaDAO|persistirPessoa|erro ao dar close no prepareStatement e Connexao");
				e.printStackTrace();
			}
			
		}
		return false;
		
	}

	public boolean autenticarPessoa(Pessoa pessoa) {
		try {
			preparedStatement = conn.prepareStatement(SQLUtils.SQL_AUTH_PESSOA);
			preparedStatement.setString(1, pessoa.getEmail());
			preparedStatement.setString(2, pessoa.getSenha());
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				System.out.println("Nome: "+resultSet.getString("nome"));
				return true;
			}
			return false;
		} catch (SQLException e) {
			System.out.println("PessoaDAO|persistirPessoa|erro ao autenticar");
			e.printStackTrace();
		}
		finally {
			try {
				preparedStatement.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("PessoaDAO|persistirPessoa|erro ao dar close no prepareStatement e Connexao");
				e.printStackTrace();
			}
			
		}
		return false;
	}
	
}
