package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Estoque;

public interface EstoqueService {

	public Estoque salvar(Estoque estoque);

	public Estoque alterar(Estoque estoque);

	public void excluir(Long idEstoque);

	public Estoque buscaPorId(Long idEstoque);

	public List<Estoque> todos();

	public List<Estoque> buscar(String estoque);

}