package com.model;

/**
 * Classe que guarda a pessoa logada no sistema
 * @author Gregori
 *
 */
public final class PessoaAutenticada {
	private static PessoaAutenticada pessoaAutenticada;
	private static Pessoa PESSOA;
	
	private PessoaAutenticada() {	}
	
	public synchronized static PessoaAutenticada getPessoaAutenticada(){
		if (pessoaAutenticada == null){
			pessoaAutenticada = new PessoaAutenticada();
		}
		return pessoaAutenticada;
	}

	public static Pessoa getPessoa() {
		return PESSOA;
	}

	public static void setPessoa(Pessoa pessoa) {
		PessoaAutenticada.PESSOA = pessoa;
	}
}
