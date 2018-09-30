package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Autorizacao;

public interface AutorizacaoRepository extends CrudRepository<Autorizacao, Long> {

	public Autorizacao findByAutorizacao(String autorizacao);

	public List<Autorizacao> findByAutorizacaoContains(String autorizacao);

	public List<Autorizacao> findByAutorizacaoContainsIgnoreCase(String autorizacao);

	@Query("select x from Autorizacao x where x.autorizacao  like %?1%")
	public List<Autorizacao> buscaAutorizacao (String autorizacao);

}
