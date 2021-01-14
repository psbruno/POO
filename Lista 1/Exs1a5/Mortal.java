package Exs1a5;

public class Mortal {
	private boolean vivo;
	
	Mortal(){
		vivo = true;
	}
	public void mata() {
		vivo = false;
	}
	public boolean isVivo() {
		return vivo;
	}
	
	
	
	public void setEstado(boolean estado) {
		vivo = estado;
	}
	
	public String toString() {
		return "Mortal";
	}
		
	
}
