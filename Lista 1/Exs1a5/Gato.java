package Exs1a5;

public class Gato extends Mortal {
	private int vidas;
	
	Gato(){
		vidas =7;
	}
	
	public void mata() {
		if(vidas>0) {
			this.vidas--;
			super.setEstado(true);
			return;
		}
		super.mata();
	}
	public String toString() {
		return "Gato";
	}
	
}
