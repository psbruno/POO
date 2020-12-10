package exS3;

public class Retangulo {
	private int base;
	private int altura;
	
	public void setRetangulo(int b, int h) {
		base = b;
		altura = h;
	}
	public int getArea() {
		return base*altura;
	}
	public int getPerimetro() {
		return 2*base+2*altura;
	}
	public double getRelacao() {
		return base/altura;
	}
	public boolean isSquare() {
		if(altura==base)
			return true;
		else
			return false;
	}
	public void getDimensoes() {
		System.out.println("Altura: " + altura + " base: " + base + "\n");
	}
}
