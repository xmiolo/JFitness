package com.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

import com.model.Pessoa;

public class PessoaDAO extends GenericDAO<Pessoa, Long> {
	private static PessoaDAO instance;
	//private Connection conn = new ConexaoJDBCFactory().getConexao();
	//private PreparedStatement preparedStatement;
	//private ResultSet resultSet;
	
	public static PessoaDAO getInstance() {
		if (instance == null) {
			instance = new PessoaDAO();
		}
		return instance;
	}
	
	
	public PessoaDAO() {
		super(Pessoa.class);
	}


	/*public boolean persistirPessoa(Pessoa pessoa) {
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
		
	}*/

	public boolean autenticaHibernate(String email, String senha){
		Pessoa userAuth = new Pessoa();
		
		Transaction tx = getSession().beginTransaction();
		SQLQuery query = getSession().createSQLQuery("select * from pessoa where email = '"+email+"' and senha = md5('"+senha+"'");
		query.addEntity(Pessoa.class);
		List<Pessoa> rows = query.list();
		for(Pessoa objeto : rows){
			if(objeto != null){
				return true;
			}
		}
		return false;
	}
	
	/*public boolean autenticarPessoa(String email, String senha) {
		try {
			preparedStatement = conn.prepareStatement(SQLUtils.SQL_AUTH_PESSOA);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, senha);
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
	}*/
	
}
