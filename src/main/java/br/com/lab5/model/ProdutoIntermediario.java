package br.com.lab5.model;

import java.util.List;

import br.com.lab5.enumerate.SegmentoEnum;
import br.com.lab5.enumerate.UnidadeMedidaEnum;

/*	
 * Esta Classe é utilizada por produtos que são para consumo
 *  e que são comprados pronto (mostarda, catupiry, etc), ou 
 *  que foram produzidos para complementar o Produto Final. 
 */

public class ProdutoIntermediario {

	private Long id;
	private String codigo;
	private String nome;
	private UnidadeMedidaEnum medida;
	private Double quantidade;
	private SegmentoEnum segmento;
	private List<MateriaPrima> materiais;
	// private Image imagem; // colocar imagem no banco verificar blob e byte to
	// array
	private String descricao;
}
