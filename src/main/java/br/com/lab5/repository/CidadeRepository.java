package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Cidade;

public interface CidadeRepository extends CrudRepository<Cidade, Long> {

	public Cidade findByCidade(String cidade);

	public List<Cidade> findByCidadeContains(String cidade);

	public List<Cidade> findByCidadeContainsIgnoreCase(String cidade);

	@Query("select x from Cidade x where x.cidade  like %?1%")
	public List<Cidade> buscaCidade(String cidade);

}
