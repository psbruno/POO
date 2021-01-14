package Ex6;

public class Triangulo extends Figura {
	double base, altura;
	
	public double getArea() {
		return base*altura/2;
	}
	
	public String toString() {
		return "Triangulo de base " + base + " e altura " + altura + ".Área: " + base*altura;
	}

}
