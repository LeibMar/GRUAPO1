package banco;


import banco.DBConnection;
import java.util.*;
public class TesteConexao {

	public static void main(String[] args) {
		
        try 
        {   
			DBConnection conexao = new DBConnection();
			System.out.println("Conexão ok");
			
        }
		catch (Exception e)	
		{	
			System.out.println("Conexão nok");
		}
		       
					
	}

}


