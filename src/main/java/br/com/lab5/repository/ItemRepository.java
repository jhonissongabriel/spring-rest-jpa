package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

	public Item findByNome(String nome);

	public List<Item> findByNomeContains(String nome);

	public List<Item> findByNomeContainsIgnoreCase(String nome);

	@Query("select x from Item x where x.nome  like %?1%")
	public List<Item> buscaItem(String nome);

}
