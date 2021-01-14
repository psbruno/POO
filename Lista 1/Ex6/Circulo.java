package Ex6;

public class Circulo extends Figura {	
	double Raio;
	public double getArea(){
		return Raio*pi;
	}
	
	public String toString() {
		return "Circulo de raio " + Raio + " e de área " + Raio*pi;
	}
}
