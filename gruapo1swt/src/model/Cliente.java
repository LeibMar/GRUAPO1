package model;

import java.time.LocalDate;

public class Cliente {
	protected Integer idCliente;
	protected String nomeCliente;
	protected String sobrenomeCliente;
	protected String cpfCliente;
	protected String enderecoCliente;
	protected String emailCliente;
	protected LocalDate dataCadastro;
	
	public Cliente(Integer idCliente, String nomeCliente, String sobrenomeCliente, String cpfCliente, String enderecoCliente, String emailCliente,  LocalDate dataCadastro) {
	
	        this.idCliente = idCliente;
	        this.nomeCliente = nomeCliente;
	        this.sobrenomeCliente = sobrenomeCliente;
	        this.cpfCliente = cpfCliente;
	        this.enderecoCliente = enderecoCliente;
	         this.emailCliente = emailCliente;
		this.dataCadastro = dataCadastro;
	}
	
	
	
	  public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}


	public void setsobreNomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}


	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public String getEnderecoCliente() {
		return enderecoCliente;
	}


	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}


	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}


	public LocalDate getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

//Deixo o método abaixo de exemplo para criar métodos de validacao de login dessa forma se for preciso
	public boolean validar() { // valida se a data do cadastro é 
		  //anterior a 3 meses da data atual
	  
		  LocalDate data = LocalDate.now();
	  
	  
	  if (this.dataCadastro.getMonthValue() < data.getMonthValue()-3) {		
		  
		  return true; 		  
	  } else { 
		  
		  return false; 
	  }
	  
	}
	 
		
}




