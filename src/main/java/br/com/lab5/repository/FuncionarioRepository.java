package br.com.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.lab5.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

	public Funcionario findByRg(String rg);

	public Funcionario findByCpf(String cpf);

	public Funcionario findByNomeCompleto(String nomeCompleto);

	public Funcionario findByUsuario(String usuario);

	public Funcionario findByEmail(String email);

	public Funcionario findByCelular(String celular);

	public Funcionario findByRegistro(String registro);

	public List<Funcionario> findByFuncao(String funcao);

	public List<Funcionario> findByTelefone(String telefone);

	public List<Funcionario> findByDataNascimento(String dataNascimento);

	public List<Funcionario> findByNomeCompletoContains(String nome);

	public List<Funcionario> findByNomeCompletoContainsIgnoreCase(String nome);

	@Query("select x from Funcionario x where x.nomeCompleto  like %?1%")
	public List<Funcionario> buscaFuncionario(String nome);

}
