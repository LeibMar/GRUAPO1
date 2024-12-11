package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import banco.DBConnection;

public class Cliente {
	protected Integer idCliente;
	protected String nomeCliente;
	protected String sobrenomeCliente;
	protected String cpfCliente;
	protected String enderecoCliente;
	protected String emailCliente;
	protected LocalDate dataCadastro;
	protected Integer ativo;
	protected String delete;
	
	public Cliente(Integer idCliente, String nomeCliente, String sobrenomeCliente, String cpfCliente, String enderecoCliente, String emailCliente,  LocalDate dataCadastro, Integer ativo, String delete) {
	
	        this.idCliente = idCliente;
	        this.nomeCliente = nomeCliente;
	        this.sobrenomeCliente = sobrenomeCliente;
	        this.cpfCliente = cpfCliente;
	        this.enderecoCliente = enderecoCliente;
	        this.emailCliente = emailCliente;
	        this.dataCadastro = dataCadastro;
	        this.ativo = ativo;
	        this.delete = delete;
	}
	
	public static void InserirCliente() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="INSERT INTO cliente(nomeCliente, sobrenomeCliente, cpfCliente, enderecoCliente, emailCliente, dataCadastro, ativo) VALUES('John', 'Doe', '00011122279', 'Rua dos Mamonas, 200, Cidade Central, SP, 07110040', 'john.doe@gmail.com', '2010/11/01', '1');";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			//Ao trabalhar com valores passados para a função de inserir consultar: "https://moodle.gru.ifsp.edu.br/pluginfile.php/146586/mod_resource/content/6/ClassesRelacionamentov2.pdf" pag13
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Erro ao tentar inserir novo cadastro de Cliente!");
			throw new RuntimeException(u);
		}
	}
	public static void LerCliente() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="SELECT FROM cliente WHERE nomeCliente = 'John' and sobrenomeCliente = 'Doe' or cpfCliente = ''";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			//Ao trabalhar com valores passados para a função de inserir consultar: "https://moodle.gru.ifsp.edu.br/pluginfile.php/146586/mod_resource/content/6/ClassesRelacionamentov2.pdf" pag13
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Cliente não encontrado!");
			throw new RuntimeException(u);
		}
	}
	
	public static void AtualizarCliente() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="UPDATE cliente SET nomeCliente = 'Jane', sobrenomeCliente = 'Smith', cpfCliente = '000000000', enderecoCliente = 'Avenida Salgado Filho', emailCliente = 'JameSmith@mail', dataCadastro ='2010/11/01', ativo = 1  WHERE idCliente = '1'";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Cliente não atualizado!");
			throw new RuntimeException(u);
		}
	}
	
	public static void DeletarCliente() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="UPDATE cliente SET  ativo = 0 WHERE idCliente = '1'";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Cliente não atualizado!");
			throw new RuntimeException(u);
		}
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




