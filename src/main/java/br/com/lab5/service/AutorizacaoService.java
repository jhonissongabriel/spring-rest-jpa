package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Autorizacao;

public interface AutorizacaoService {

	public Autorizacao salvar(Autorizacao autorizacao);

	public Autorizacao alterar(Autorizacao autorizacao);

	public void excluir(Long idAutorizacao);

	public Autorizacao buscaPorId(Long idAutorizacao);

	public List<Autorizacao> todos();

	public List<Autorizacao> buscar(String autorizacao);

}
