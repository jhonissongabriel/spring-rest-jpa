package br.com.lab5.enumerate;

public enum ProdutoFinalEnum {
	
	BEBIDA("Bebida Quente"),
	SUCO("Suco Natural"),
	TAPIOCA("Tapioca"),
	CUSCUZ("Cuscuz"),
	CALDINHO("Caldinho"),
	MANDIOCA_RECHEADA("Mandioca Recheada");
	
	public String nomeProdutoFinal;
	
	ProdutoFinalEnum(String nome){
		nomeProdutoFinal = nome;
	}
}
