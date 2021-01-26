	package Excecao_ex2e3;
	
	public class CustomException extends Exception  {
		String Erro;
		
		public CustomException(String erro) throws CustomException{
			super();
			Erro = erro;
		}
		public void printErro() {
			System.out.println(Erro);
		}
	}
