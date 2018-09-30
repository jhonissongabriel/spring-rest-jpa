package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Logradouro;

public interface LogradouroService {

	public Logradouro salvar(Logradouro logradouro);

	public Logradouro alterar(Logradouro logradouro);

	public void excluir(Long idLogradouro);

	public Logradouro buscaPorId(Long idLogradouro);

	public List<Logradouro> todos();

	public List<Logradouro> buscar(String logradouro);
}
