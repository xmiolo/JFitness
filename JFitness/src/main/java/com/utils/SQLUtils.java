package com.utils;

public class SQLUtils {
	public static String SQL_INSERT_PESSOA = "INSERT INTO public.pessoa(\"cdPessoa\", nome, senha, email, endereco, cidade) VALUES (?,?,?,?,?,?);";
	public static String SQL_AUTH_PESSOA = "SELECT * FROM public.pessoa where email ilike ? and senha = md5(?);";
}
