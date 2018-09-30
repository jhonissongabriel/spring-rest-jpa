package br.com.lab5.enumerate;

public enum UnidadeMedidaEnum {
	
	UN("Unidade", "Un",1.0),
	KG("Kilograma","Kg",1.0),
	GR("Grama","Gr",0.001),
	LT("Litro","Lt",1.0),
	ML("Mililitro","Ml",0.001);
	
	public String nomeUnidMedida;
	public String abrevUnidMedida;
	public Double valorUnidMedida;
	
	UnidadeMedidaEnum(String nomeUM, String abrevUM, Double valorUM){
		nomeUnidMedida = nomeUM;
		abrevUnidMedida = nomeUM;
		valorUnidMedida = valorUM;
	}
	

}
