package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Funcao;

public interface FuncaoService {

	public Funcao salvar(Funcao funcao);

	public Funcao alterar(Funcao funcao);

	public void excluir(Long idFuncao);

	public Funcao buscaPorId(Long idFuncao);

	public List<Funcao> todos();

	public List<Funcao> buscar(String funcao);

}
