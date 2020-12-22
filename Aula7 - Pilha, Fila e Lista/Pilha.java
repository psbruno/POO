package Aula7;

public class Pilha extends Lista {
	public Pilha(int Valor){
		super("Pilha", Valor);
	}
	
	public Lista getTopo() {
		Lista pilha = this;
		while(pilha.prox!=null)
			pilha=pilha.prox;
		
		return pilha;
	}
	
	public void Push(int num) {
		Lista pilha = this;
		while(pilha.prox!=null)
			pilha=pilha.prox;
		
		pilha.prox = new Lista("Pilha", num);
		
	}
	public void Pop() {
		Lista pilha = this;
		Lista ant = this;
		
			
		while(pilha.prox!=null) {
			ant = pilha;
			pilha = pilha.prox;
		}
		ant.prox=null;
	}
	
	public void printPilha() {
		Lista pilha = this;
		while(pilha != null) {
			System.out.println(pilha.getValor());
			pilha = pilha.prox;
		}
	}
	
}
