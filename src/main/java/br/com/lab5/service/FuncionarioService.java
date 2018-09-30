package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Funcionario;

public interface FuncionarioService {

	public Funcionario salvar(Funcionario funcionario);

	public Funcionario alterar(Funcionario funcionario);

	public void excluir(Long idFuncionario);

	public Funcionario buscaPorId(Long idFuncionario);

	public List<Funcionario> todos();

	public List<Funcionario> buscar(String funcionario);

}
