package model;

public class EspacoPadrao extends Espaco{



	public EspacoPadrao(Integer idEspaco, Integer ocupado, String tamanho, Integer ativo, String extintor, String delete) {
		super(idEspaco, ocupado, tamanho, ativo, extintor, delete);
		// TODO Auto-generated constructor stub
	}

	//Metodo de acionamento de extintor de acordo com o tipo do Espaço Inflamavel
	public void acionarExtintintorPadrao(){}
}

