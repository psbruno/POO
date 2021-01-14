package Ex6;

public class Paralelogramo extends Figura {
	double base, altura;
	public double getArea(){
		return base*altura;
	}
	
	public String toString() {
		return "Paralelogramo de base " + base + "e altura"  + altura; 
	}
}
