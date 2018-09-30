package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.ProdutoIntermediario;

public interface ProdutoIntermediarioRepository extends CrudRepository<ProdutoIntermediario, Long> {

	public ProdutoIntermediario findByNome(String nome);

	public ProdutoIntermediario findByCodigo(String codigo);

	public List<ProdutoIntermediario> findByNomeContains(String nome);

	public List<ProdutoIntermediario> findBySegmentoContains(String segmento);

	public List<ProdutoIntermediario> findByNomeContainsIgnoreCase(String nome);

	public List<ProdutoIntermediario> findBySegmentoContainsIgnoreCase(String segmento);

	@Query("select x from ProdutoIntermediario x where x.nome  like %?1%")
	public List<ProdutoIntermediario> buscaProdutoIntermediario(String nome);

}
