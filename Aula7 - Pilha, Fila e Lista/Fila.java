package Aula7;

public class Fila extends Lista {
	Lista inicio;
	
	
	public Fila(int Valor){
		super("Fila", Valor);
		inicio = this;
	}
	
	public Lista getFim() {
		Lista fila = this;
		while(fila.prox!=null)
			fila=fila.prox;
		
		return fila;
	}
	
	
	public void insere(int num) {
		Lista fila = this;
		
		while(fila.prox!=null)
			fila = fila.prox;
		
		fila.prox = new Lista("fila", num);
	}
	
	public void remove() {
		inicio = inicio.prox;
	}
	
	
	public void printFila() {
		Lista fila = inicio;
		while(fila != null) {
			System.out.printf(fila.getValor() + " ");
			fila = fila.prox;
		}
	}
	

}
