package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Estado;

public interface EstadoService {

	public Estado salvar(Estado estado);

	public Estado alterar(Estado estado);

	public void excluir(Long idEstado);

	public Estado buscaPorId(Long idEstado);

	public List<Estado> todos();

	public List<Estado> buscar(String estado);

}
