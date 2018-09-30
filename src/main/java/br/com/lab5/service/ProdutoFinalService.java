package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.ProdutoFinal;

public interface ProdutoFinalService {

	public ProdutoFinal salvar(ProdutoFinal produtoFinal);

	public ProdutoFinal alterar(ProdutoFinal produtoFinal);

	public void excluir(Long idProdutoFinal);

	public ProdutoFinal buscaPorId(Long idProdutoFinal);

	public List<ProdutoFinal> todos();

	public List<ProdutoFinal> buscar(String produtoFinal);
}
