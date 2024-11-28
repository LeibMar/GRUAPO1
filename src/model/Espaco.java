package model;

public class Espaco {
	protected Integer idEspaco;
	protected Integer ocupado;
	protected String tamanho;
	protected Integer ativo;
	protected String extintor;
	
	
	public Espaco(Integer idEspaco, Integer ocupado, String tamanho, Integer ativo, String extintor) {
	
	        this.idEspaco = idEspaco;
	        this.ocupado = ocupado;
	        this.tamanho = tamanho;
	        this.ativo = ativo;
	        this.extintor = extintor;
	        
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



