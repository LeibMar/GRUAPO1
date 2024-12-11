package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import banco.DBConnection;

public class Agenda {

	
		

		protected LocalDate dia;
		protected Integer mes;
		protected Integer ano;
		protected Integer idLocacao;
		protected Integer ativo;
		protected String delete;
		
		public Agenda(Integer idAgenda, LocalDate dia, Integer mes, Integer ano, Integer idLocacao, Integer ativo,  String delete) {
			
	        this.idAgenda = idAgenda;
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	        this.idLocacao = idLocacao;
	        this.ativo = ativo;
	        this.delete = delete;
	     }
		public static void InserirAgenda() {
			DBConnection Connection = new DBConnection();
			
			try{
				String sql="INSERT INTO agenda(dia, mes, ano, idLocacao, ativo) VALUES('2024/12/01', '12', '2024', '1', '1');";
				PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
				//Ao trabalhar com valores passados para a função de inserir consultar: "https://moodle.gru.ifsp.edu.br/pluginfile.php/146586/mod_resource/content/6/ClassesRelacionamentov2.pdf" pag13
				statement.execute();
				statement.close();
			}
			catch(SQLException u){
				System.out.println("Erro ao tentar inserir novo cadastro de agenda!");
				throw new RuntimeException(u);
			}
		}
		
		public static void LerAgenda() {
			DBConnection Connection = new DBConnection();
			
			try{
				String sql="SELECT FROM locacao WHERE dia = '2024/12/01' or mes = '' or ano = '' or idLocacao = '1'";
				PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
				
				statement.execute();
				statement.close();
			}
			catch(SQLException u){
				System.out.println("Agenda não encontrado!");
				throw new RuntimeException(u);
			}
		}
		
		public static void AtualizarAgenda() {
			DBConnection Connection = new DBConnection();
			
			try{
				String sql="UPDATE agenda SET dia = '2024/11/07', mes = '11', ano = '2024', idLocacao = '1' ativo = 1  WHERE idAgenda = '1'";
				PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
				
				statement.execute();
				statement.close();
			}
			catch(SQLException u){
				System.out.println("Agenda não atualizada!");
				throw new RuntimeException(u);
			}
		}
		
		public static void DeletarAgenda() {
			DBConnection Connection = new DBConnection();
			
			try{
				String sql="UPDATE agenda SET  ativo = 0 WHERE idAgenda = '1'";
				PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
				
				statement.execute();
				statement.close();
			}
			catch(SQLException u){
				System.out.println("Agenda atualizada!");
				throw new RuntimeException(u);
			}
		}

	
	
protected Integer idAgenda;
public Integer getIdAgenda() {
	return idAgenda;
}

public void setIdAgenda(Integer idAgenda) {
	this.idAgenda = idAgenda;
}

public LocalDate getDia() {
	return dia;
}

public void setDia(LocalDate dia) {
	this.dia = dia;
}

public Integer getMes() {
	return mes;
}

public void setMes(Integer mes) {
	this.mes = mes;
}

public Integer getAno() {
	return ano;
}

public void setAno(Integer ano) {
	this.ano = ano;
}

public Integer getIdLocacao() {
	return idLocacao;
}

public void setIdLocacao(Integer idLocacao) {
	this.idLocacao = idLocacao;
}

public Integer getAtivo() {
	return ativo;
}

public void setAtivo(Integer ativo) {
	this.ativo = ativo;
}

public String getDelete() {
	return delete;
}

public void setDelete(String delete) {
	this.delete = delete;
}
		
}
