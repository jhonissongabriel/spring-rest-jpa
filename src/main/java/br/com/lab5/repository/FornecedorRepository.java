package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Fornecedor;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {

	public Fornecedor findByCnpj(String cnpj);

	public Fornecedor findByNomeFantasia(String nomeFantasia);

	public List<Fornecedor> findBySegmentoContains(String segmento);

	public List<Fornecedor> findByNomeFantasiaContains(String nomeFantasia);

	public List<Fornecedor> findByNomeFantasiaContainsIgnoreCase(String nomeFantasia);

	@Query("select x from Fornecedor x where x.nomeFantasia  like %?1%")
	public List<Fornecedor> buscaFornecedor(String nomeFantasia);

}
