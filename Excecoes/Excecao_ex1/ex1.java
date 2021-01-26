package Excecao_ex1;

public class ex1 {
	
	public static void main(String args[]){		
		try {
			throw new Exception();
		}catch( Exception Erro){
			System.err.println("Ocorreu um erro");
		}
		finally {
			System.out.println("Finalizando");
		}		
		
	}

}