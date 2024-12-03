package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import banco.DBConnection;

public class Agenda {

	
	public static void InserirAgenda() {
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
}
