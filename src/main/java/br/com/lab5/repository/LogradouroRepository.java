package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Logradouro;

public interface LogradouroRepository extends CrudRepository<Logradouro, Long> {

	public Logradouro findByLogradouro(String logradouro);

	public List<Logradouro> findByLogradouroContains(String logradouro);

	public List<Logradouro> findByLogradouroContainsIgnoreCase(String logradouro);

	@Query("select x from Logradouro x where x.logradouro  like %?1%")
	public List<Logradouro> buscaLogradouro(String logradouro);

}
