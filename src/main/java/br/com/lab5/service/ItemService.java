package br.com.lab5.service;

import java.util.List;

import br.com.lab5.model.Item;

public interface ItemService {

	public Item salvar(Item item);

	public Item alterar(Item item);

	public void excluir(Long idItem);

	public Item buscaPorId(Long idItem);

	public List<Item> todos();

	public List<Item> buscar(String item);

}
