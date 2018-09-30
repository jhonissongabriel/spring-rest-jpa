package br.com.lab5.enumerate;

public enum FuncaoEnum {
	
	GARCON("Garçon"),
	AUXILIAR_COZINHA("Auxiliar de Cozinha"),
	CAIXA("Caixa"),
	ESTOQUISTA("Estoquista"),
	SUPERVISOR("Supervisor"),
	GERENTE("Gerente"),
	ADMINISTRADOR("Administrador do Sistema");
	
	public String nomeFuncao;
	
	FuncaoEnum(String funcao){
		nomeFuncao = funcao;
	}

}
