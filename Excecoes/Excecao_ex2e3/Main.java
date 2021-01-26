package Excecao_ex2e3;

public class Main {
	
	public static void main(String args[]){		
		try {
			throw new CustomException("Aconteceu algum erro");
		}catch(CustomException E){
			E.printErro();
		}
		finally {
			System.out.println("Finalizando");
		}		
		
	}

}
