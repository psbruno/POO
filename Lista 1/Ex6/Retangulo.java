package Ex6;

public class Retangulo extends Figura {
	double Lado1,Lado2;
	public double getArea(){
		return Lado1*Lado2;
	}
	
	public String toString() {
		return "Retangulo de lados " + Lado1 + Lado2+  " e de área " + Lado1*Lado2;
	}
}
