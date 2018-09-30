package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Fornecedor;
import br.com.lab5.model.MateriaPrima;

public interface MateriaPrimaRepository extends CrudRepository<MateriaPrima, Long> {

	public MateriaPrima findByNome(String nome);

	public MateriaPrima findByCodigo(String codigo);

	public List<MateriaPrima> findByMedida(String medida);

	public List<MateriaPrima> findBySegmento(String segmento);

	public List<Fornecedor> findByFornecedor(String fornecedor);

	public List<MateriaPrima> findByNomeContains(String nome);

	public List<MateriaPrima> findByMedidaContains(String medida);

	public List<MateriaPrima> findBySegmentoContains(String segmento);

	public List<Fornecedor> findByFornecedorContains(String fornecedor);

	public List<MateriaPrima> findByNomeContainsIgnoreCase(String nome);

	public List<MateriaPrima> findByMedidaContainsIgnoreCase(String medida);

	public List<MateriaPrima> findBySegmentoContainsIgnoreCase(String segmento);

	public List<Fornecedor> findByFornecedorContainsIgnoreCase(String fornecedor);

	@Query("select x from MateriaPrima x where x.nome  like %?1%")
	public List<MateriaPrima> buscaNomeMateriaPrima(String nome);

}
