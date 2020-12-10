package exS3;

public class Quadrado {
	private double lado;
	private double area;
	
	
	public void setLado(double NovoLado) {
		lado = NovoLado;
		area = lado*lado;
	}
	public double getLado() {
		return lado;
	}
	
	public double getArea() {
		return area;
	}
	
	public void AumentarLado() {
		lado+=1;
	}
	
	
}
