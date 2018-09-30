package br.com.lab5.model;

import java.util.List;

import br.com.lab5.enumerate.SegmentoEnum;
import br.com.lab5.enumerate.UnidadeMedidaEnum;

public class MateriaPrima {

	private Long id;
	private String codigo;
	private String nome;
	private UnidadeMedidaEnum medida;
	private Double quantidade;
	private SegmentoEnum segmento;
	private List<Fornecedor> fornecedor;
	// private Image imagem; // colocar imagem no banco verificar blob e byte to
	// array
	private String descricao;
}
