package exS3;

public class Carro {
	private String Modelo;
	private int velocidade;
	Contador contA= new Contador();
	Contador contF= new Contador();
	Contador contL= new Contador();
	
	
	public void novo(String modelo) {
		Modelo = modelo;
		contL.start0();
	}
	
	public void Ligar() {
		velocidade=0;
		contA.start0();
		contF.start0();
		contL.increment1();
	}
	
	public void acelerar(int kmh) {
		System.out.printf("Acelerando o carro para %d\n", kmh+velocidade);
		velocidade = velocidade + kmh;
		contA.increment1();
	}
	
	public void freiar(int kmh) {
		velocidade -= kmh;
		contF.increment1();
	}
	public int getFreadas() {
		return contF.getContador();
	}
	public int getAceleradas() {
		return contA.getContador();
	}
	public int getLigadas() {
		return contL.getContador();
	}
	public int getVelocidade() {
		return velocidade;
	}
}
