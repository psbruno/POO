package Excecao_ex4e5;

public class Objeto {
	Objeto O;
	int a;
	int b;
	
	public void f() {
		try {
			O.g();
			O.getA();
			throw new Exception();
		}catch(Exception E) {
			System.out.println("Erro");
		}
	}
	
	public void g() {
		O = null;
	}
	 
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
}
