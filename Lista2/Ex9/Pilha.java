package Ex9;

import java.util.LinkedList;

public class Pilha {
	LinkedList Pilha;
		
	public void push(int valor, Pilha pilha) {
		pilha.Pilha.add(valor);
	}
	public void pop(Pilha pilha) {
		pilha.Pilha.remove(pilha.Pilha.size());
	}
	public Pilha top(Pilha pilha) {
		return (Pilha) pilha.Pilha.get(pilha.Pilha.size());
	}
}
