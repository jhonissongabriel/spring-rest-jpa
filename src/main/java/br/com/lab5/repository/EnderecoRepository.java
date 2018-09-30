package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

	public List<Endereco> findByCep(String cep);

	public List<Endereco> findByBairro(String bairro);

	public List<Endereco> findByBairroContains(String bairro);

	public List<Endereco> findByBairroContainsIgnoreCase(String bairro);

	@Query("select x from Endereco x where x.cep  like %?1%")
	public List<Endereco> buscaCep(String cep);

	@Query("select x from Endereco x where x.bairro  like %?1%")
	public List<Endereco> buscaBairro(String bairro);

}
