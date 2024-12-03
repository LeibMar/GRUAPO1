package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import banco.DBConnection;

public class Funcionario {
	protected Integer idFuncionario;
	protected String nomeFuncionario;
	protected String sobrenomeFuncionario;
	protected String senha;
	protected Integer hierarquia;
	protected Integer funcionarioOrigem;
	protected Integer ativo;
	protected String delete;
	
	public Funcionario(Integer idFuncionario, String nomeFuncionario, String sobrenomeFuncionario, Integer hierarquia, Integer funcionarioOrigem, Integer ativo, String delete) {
		
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenomeFuncionario = sobrenomeFuncionario;
        this.hierarquia = hierarquia;
        this.funcionarioOrigem = funcionarioOrigem;
        this.ativo = ativo;
        this.delete = delete;
     }
	
	public static void InserirFuncionario() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="INSERT INTO funcionario(nomeFuncionario, sobrenomeFuncionario, hierarquia, funcionarioOrigem, ativo) VALUES('John', 'Doe', '1', '1', '1');";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			//Ao trabalhar com valores passados para a função de inserir consultar: "https://moodle.gru.ifsp.edu.br/pluginfile.php/146586/mod_resource/content/6/ClassesRelacionamentov2.pdf" pag13
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Erro ao tentar inserir novo cadastro de Funcionario!");
			throw new RuntimeException(u);
		}
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getSobrenomeFuncionario() {
		return sobrenomeFuncionario;
	}

	public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
		this.sobrenomeFuncionario = sobrenomeFuncionario;
	}

	public Integer getHierarquia() {
		return hierarquia;
	}

	public void setHierarquia(Integer hierarquia) {
		this.hierarquia = hierarquia;
	}

	public Integer getFuncionarioOrigem() {
		return funcionarioOrigem;
	}

	public void setFuncionarioOrigem(Integer funcionarioOrigem) {
		this.funcionarioOrigem = funcionarioOrigem;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	
	
	
}
