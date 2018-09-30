package br.com.lab5.model;

import java.util.List;

import br.com.lab5.enumerate.ProdutoFinalEnum;

/*	
 * Esta Classe é utilizada por produtos já acabados 
 * produzidos no local através da matéria prima. 
 */

public class ProdutoFInal {

	private Long id;
	private String codigo;
	private String nome;
	private Double valor; // talvez não seja necessário
	private List<MateriaPrima> materiais;
	private ProdutoFinalEnum produtoFinal;
	private String descricao;

}
