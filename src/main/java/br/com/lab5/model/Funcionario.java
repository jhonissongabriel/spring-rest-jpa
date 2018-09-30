package br.com.lab5.model;

import java.util.Date;

public class Funcionario {

	private Long id;
	// Dados Pessoais
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private Date dataNascimento;

	// Contato
	private String email;
	private String telefone;
	private String celular;
	private Endereco endereco;
	private Cidade cidade;
	private Estado estado;

	// Dados Profissionais
	private String registro;
	private String usuario;
	private String senha;
	private Funcao funcao;
	private Autorizacao autorizacao;
	private Date dataAdmissao;
	private Date dataDemissao;

}
