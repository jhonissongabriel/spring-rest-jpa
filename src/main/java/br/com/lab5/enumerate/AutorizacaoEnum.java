package br.com.lab5.enumerate;

public enum AutorizacaoEnum {
	
	NEGADO("Permissão Negada"),			// nível de acesso negado, funcionário não possui permissão para acessar o sistema
	BASICO("Permissão Nível 1"),			// nível de acesso básico, com este acesso pode apenas fazer algumas pesquisas
	SUPERVISAO("Permissão Nível 2"),		// nível de acesso supervisão, funcionário pode fazer CRUD
	GERENCIAL("Permissão Nível 3"),		// nível de acesso gerencial, altera autorizações, cadastra funcionario
	ADMIN("Permissão Nível 4");			// nível de acesso administrador, acesso total

	public String nomeAutorizacao;
	
	AutorizacaoEnum(String autorizacao){
		nomeAutorizacao = autorizacao;
	}
}
