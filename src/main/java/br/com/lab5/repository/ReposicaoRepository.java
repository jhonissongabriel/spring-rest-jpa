package br.com.lab5.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Reposicao;

public interface ReposicaoRepository extends CrudRepository<Reposicao, Long> {

	public Reposicao findByDataCompra(Date dataCompra);

	@Query("select x from Reposicao x where x.dataCompra  like %?1%")
	public List<Reposicao> buscaReposicao(String dataCompra);

}
