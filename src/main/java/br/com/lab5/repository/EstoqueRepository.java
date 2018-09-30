package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Estoque;

public interface EstoqueRepository extends CrudRepository<Estoque, Long> {

	public List<Estoque> findBySegmento(String segmento);

	public List<Estoque> findBySegmentoContains(String segmento);

	@Query("select x from Estoque x where x.segmento  like %?1%")
	public List<Estoque> buscaEstoque(String segmento);

}
