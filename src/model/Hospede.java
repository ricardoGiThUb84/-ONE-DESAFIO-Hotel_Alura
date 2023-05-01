package model;

import java.sql.Date;

import java.lang.String;

public class Hospede {
	

	private Integer id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private Long telefone;
    private Long numeroReserva;
    
    
	
    
    public Hospede() {
		
	}


	public Hospede(String nome, String sobrenome, Date dataNascimento, String nacionalidade, Long telefone,
			Long numeroReserva) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
		this.numeroReserva = numeroReserva;
	}
	
	
	
	


	public Hospede(Integer id, String nome, String sobrenome, Date dataNascimento,
			String nacionalidade, Long telefone, Long numeroReserva) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
		this.numeroReserva = numeroReserva;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public Long getTelefone() {
		return telefone;
	}


	public Long getNumeroReserva() {
		return numeroReserva;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}


	public void setNumeroReserva(Long numeroReserva) {
		this.numeroReserva = numeroReserva;
	}


	@Override
	public String toString() {
		return "Hospede [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
				+ ", nacionalidade=" + nacionalidade + ", telefone=" + telefone + ", numeroReserva=" + numeroReserva
				+ "]";
	}

}
