package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Fornecedor;

public interface FornecedorService {

	public Fornecedor salvar(Fornecedor fornecedor);

	public Fornecedor alterar(Fornecedor fornecedor);

	public void excluir(Long idFornecedor);

	public Fornecedor buscaPorId(Long idFornecedor);

	public List<Fornecedor> todos();

	public List<Fornecedor> buscar(String fornecedor);

}
