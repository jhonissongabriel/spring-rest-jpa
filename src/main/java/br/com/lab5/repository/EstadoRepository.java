package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Estado;

public interface EstadoRepository extends CrudRepository<Estado, Long> {

	public List<Estado> findByUfContains(String uf);

	public List<Estado> findByEstadoContains(String estado);

	public List<Estado> findByUfContainsIgnoreCase(String uf);

	public List<Estado> findByEstadoContainsIgnoreCase(String estado);

	@Query("select x from Estado x where x.estado  like %?1%")
	public List<Estado> buscaEstado(String estado);

	@Query("select x from Estado x where x.uf  like %?1%")
	public List<Estado> buscaUf(String uf);

}
