package br.com.lab5.enumerate;

public enum SegmentoEnum {
	
	EMBALAGEM("Embalagens"),				// embalagens para entrega
	HIGIENE("Higiene"),						// material de manuseio higienico e.g.(touca, luvas,etx)
	LIMPEZA("Limpeza"),						// material limpeza do ambiente e.g.(detergente, álcool, etc)
	MATERIA_PRIMA("Matéria Prima"),			// matéria prima para a confecção do produto final
	RECHEIO("Recheio"),						// recheios pré-produzidos ou preparados no ato
	MOLHO("Molho"),							// molhos pré-produzidos ou preparados no ato
	BEBIDA_PRONTA("Bebida Pronta"),			// bebidas prontas para o consumo final e.g.(refrigerante, suco industrializado, etc)
	BEBIDA_PRODUZIDA("Bebida Preparada"),	// bebidas pré-produzidos ou preparados no ato e.g.(café, chocolate, suco natual, ect)
	OUTRO("Outro"),							// algum matgerial que não se enquadre nas opções disponíveis
	PRODUTO_FINAL("Produto Final");			// produtos prontos para consumo ou que complementam o produto final e.g.(tapioca, cuscuz, etc)
	
	
	public String nomeSegmento;
	
	SegmentoEnum(String segmento){
		nomeSegmento = segmento;
	}
	

}
