package exS3;

public class Contador {
	private int contador;
	
	
	public void start0() {
		contador=0;
	}
	public void startN(int N) {
		contador =N;
	}
	public int getContador() {
		return contador;
	}
	public void increment1() {
		contador++;
	}
	public void incrementN(int N) {
		contador+=N;
	}
	public void decrement1() {
		contador--;
	}
	public void decrementN(int N) {
		contador-=N;
	}
	public void visualizar() {
		System.out.println("Contador == " + contador);
	}
}
