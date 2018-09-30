package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Endereco;

public interface EnderecoService {

	public Endereco salvar(Endereco endereco);

	public Endereco alterar(Endereco endereco);

	public void excluir(Long idEndereco);

	public Endereco buscaPorId(Long idEndereco);

	public List<Endereco> todos();

	public List<Endereco> buscar(String endereco);

}
