package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.ProdutoFinal;

public interface ProdutoFinalRepository extends CrudRepository<ProdutoFinal, Long> {

	public ProdutoFinal findByNome(String nome);

	public ProdutoFinal findByCodigo(String codigo);

	public List<ProdutoFinal> findByNomeContains(String nome);

	public List<ProdutoFinal> findByNomeContainsIgnoreCase(String nome);

	@Query("select x from ProdutoFinal x where x.nome  like %?1%")
	public List<ProdutoFinal> buscaProdutoFinal(String nome);

}
