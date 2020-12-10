package exS3;

public class Triangulo {
	
	private double base;
	private double altura;
	private double lado1, lado2;

	
	
	public void setBase(double b) {
		base=b;
	}
	public void setAltura(double h) {
		altura =h;
	}
	public void setLado1(double l1) {
		lado1=l1;
	}
	public void setLado2(double l2) {
		lado2=l2;
	}
	
	public double getLado1() {
		return lado1;
	}
	public double getLado2(double l1) {
		return lado2;
	}
	
	public double getBase(double b) {
		return base;
	}
	
	public double getAltura(double h) {
		return altura;
	}
	
	public void trianguloDefault() {
		altura=2;
		base=3;
		lado1=2;
		lado2=2;
	}
	public void setTriangulo(double h, double b, double l1, double l2) {
		altura=h;
		base=b;
		lado1=l1;
		lado2=l2;
	}
	
	public void mostra() {
		System.out.printf("base : " + base +"\naltura: "+ altura+"\nlado 1: " + lado1+"\nlado 2: " + lado2);
	}
	
	public double area() {
		return base*altura/2;
	}
	
}
 