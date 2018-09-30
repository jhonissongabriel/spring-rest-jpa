package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Funcao;

public interface FuncaoRepository extends CrudRepository<Funcao, Long> {

	public Funcao findByFuncao(String funcao);

	public List<Funcao> findByFuncaoContains(String funcao);

	public List<Funcao> findByFuncaoContainsIgnoreCase(String funcao);

	@Query("select x from Funcao x where x.funcao  like %?1%")
	public List<Funcao> buscaFuncao(String funcao);

}
