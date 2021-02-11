package Ex_10;

import java.util.LinkedList;

public class Fila {
	LinkedList fila;
	
	public void enfileira(Fila f, int valor) {
		f.fila.add(valor);
	}
	public void desenfileira(Fila f, int valor) {
		f.fila.remove(0);
	}
	public boolean vazio(Fila f) {
		if(f.fila.size()==0)
			return true;
		else
			return false;
	}
}
