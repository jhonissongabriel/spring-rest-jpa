package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.MateriaPrima;

public interface MateriaPrimaService {

	public MateriaPrima salvar(MateriaPrima materiaPrima);

	public MateriaPrima alterar(MateriaPrima materiaPrima);

	public void excluir(Long idMateriaPrima);

	public MateriaPrima buscaPorId(Long idMateriaPrima);

	public List<MateriaPrima> todos();

	public List<MateriaPrima> buscar(String materiaPrima);

}
