package Ex6;

public class Losango extends Paralelogramo {
	double Diagonal, diagonal;
	
	public double getArea() {
		return Diagonal*diagonal/2;	
	}
	
	public String toString() {
		return "Losango de diagonais " + Diagonal + diagonal+ "e area " + Diagonal*diagonal;
	}
}
