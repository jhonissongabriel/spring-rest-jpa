package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Cidade;

public interface CidadeService {

	public Cidade salvar(Cidade cidade);

	public Cidade alterar(Cidade cidade);

	public void excluir(Long idCidade);

	public Cidade buscaPorId(Long idCidade);

	public List<Cidade> todos();

	public List<Cidade> buscar(String cidade);

}