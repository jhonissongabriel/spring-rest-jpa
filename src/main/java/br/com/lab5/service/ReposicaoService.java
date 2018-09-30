package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Reposicao;

public interface ReposicaoService {

	public Reposicao salvar(Reposicao reposicao);

	public Reposicao alterar(Reposicao reposicao);

	public void excluir(Long idReposicao);

	public Reposicao buscaPorId(Long idReposicao);

	public List<Reposicao> todos();

	public List<Reposicao> buscar(String reposicao);

}
