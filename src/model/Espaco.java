package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import banco.DBConnection;

public class Espaco {
	protected Integer idEspaco;
	protected Integer ocupado;
	protected String tamanho;
	protected Integer ativo;
	protected String extintor;
	protected String delete;
	
	public Espaco(Integer idEspaco, Integer ocupado, String tamanho, Integer ativo, String extintor, String delete) {
	
	        this.idEspaco = idEspaco;
	        this.ocupado = ocupado;
	        this.tamanho = tamanho;
	        this.ativo = ativo;
	        this.extintor = extintor;
	        this.delete = delete;
	}
	
	public static void InserirEspaco() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="INSERT INTO espaco(ocupado, tamanho, extintor, tipoEspaco, ativo) VALUES('1', '200', '1', '0', '1');";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			//Ao trabalhar com valores passados para a função de inserir consultar: "https://moodle.gru.ifsp.edu.br/pluginfile.php/146586/mod_resource/content/6/ClassesRelacionamentov2.pdf" pag13
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Erro ao tentar inserir novo cadastro de espaço!");
			throw new RuntimeException(u);
		}
	}

	public Integer getIdEspaco() {
		return idEspaco;
	}


	public void setIdEspaco(Integer idEspaco) {
		this.idEspaco = idEspaco;
	}


	public Integer getOcupado() {
		return ocupado;
	}


	public void setOcupado(Integer ocupado) {
		this.ocupado = ocupado;
	}
	
	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getAtivo() {
		return ativo;
	}


	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	
	public String getExtintor() {
		return extintor;
	}


	public void setExtintor(String extintor) {
		this.extintor = extintor;
	}
	
};



