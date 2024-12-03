package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import banco.DBConnection;

public class Locacao {
	protected Integer idLocacao;
	protected LocalDate dataInicioLocacao;
	protected LocalDate dataFimLocacao;
	protected Integer statusPagamento;
	protected Integer idCliente;
	protected Integer ativo;
	protected Integer renovado;
	
	public Locacao(Integer idLocacao, LocalDate dataInicioLocacao, LocalDate dataFimLocacao, Integer statusPagamento, Integer idCliente, Integer ativo, Integer renovado) {
		
        this.idLocacao = idLocacao;
        this.dataInicioLocacao = dataInicioLocacao;
        this.dataFimLocacao = dataFimLocacao;
        this.statusPagamento = statusPagamento;
        this.idCliente = idCliente;
        this.ativo = ativo;
        this.renovado = renovado;
     }
	
	public static void InserirLocacao() {
		DBConnection Connection = new DBConnection();
		
		try{
			String sql="INSERT INTO locacao(dataInicioLocacao, dataFimLocacao, statusPagamento, idCliente, ativo, renovado) VALUES('2024/12/01', '2025/02/01', '1', '1', '1', '0');";
			PreparedStatement statement = Connection.getConnection().prepareStatement(sql);
			//Ao trabalhar com valores passados para a função de inserir consultar: "https://moodle.gru.ifsp.edu.br/pluginfile.php/146586/mod_resource/content/6/ClassesRelacionamentov2.pdf" pag13
			statement.execute();
			statement.close();
		}
		catch(SQLException u){
			System.out.println("Erro ao tentar inserir novo cadastro de Locacao!");
			throw new RuntimeException(u);
		}
	}

	public Integer getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(Integer idLocacao) {
		this.idLocacao = idLocacao;
	}

	public LocalDate getDataInicioLocacao() {
		return dataInicioLocacao;
	}

	public void setDataInicioLocacao(LocalDate dataInicioLocacao) {
		this.dataInicioLocacao = dataInicioLocacao;
	}

	public LocalDate getDataFimLocacao() {
		return dataFimLocacao;
	}

	public void setDataFimLocacao(LocalDate dataFimLocacao) {
		this.dataFimLocacao = dataFimLocacao;
	}

	public Integer getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(Integer statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getRenovado() {
		return renovado;
	}

	public void setRenovado(Integer renovado) {
		this.renovado = renovado;
	}
	
	
}
