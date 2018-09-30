package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.ProdutoIntermediario;

public interface ProdutoIntermediarioService {

	public ProdutoIntermediario salvar(ProdutoIntermediario produtoIntermediario);

	public ProdutoIntermediario alterar(ProdutoIntermediario produtoIntermediario);

	public void excluir(Long idProdutoIntermediario);

	public ProdutoIntermediario buscaPorId(Long idProdutoIntermediario);

	public List<ProdutoIntermediario> todos();

	public List<ProdutoIntermediario> buscar(String produtoIntermediario);
}
