package Aula7;

public class Lista {
	private String Nome;
	private int Valor;
	Lista prox;
	
	public Lista(String nome, int valor) {
		this.Nome = nome;
		this.Valor=valor;
		this.prox = null;
	}

	public String getNome() {
		return this.Nome;
	}
	public int getValor() {
		return this.Valor;
	}
	
	public void insere(int valor) {
		Lista Elemento = this;
		while(Elemento.prox!=null)
			Elemento=Elemento.prox;
		
		Elemento.prox = new Lista("Lista",valor);
		
	}
	public void remove(int valor) {
		Lista Elemento = this;
		
		while(Elemento.prox.Valor != valor) {
			Elemento= Elemento.prox;
			
			if(Elemento.prox == null) {
				System.err.println(valor +" nao encontrado!!!");
				return;
			}
		}
		System.out.println("Removendo " + Elemento.prox.getValor());
		Elemento.prox = Elemento.prox.prox;
		
		
	}
	public void printLista() {
		Lista Elemento = this;
		
		while(Elemento !=null) {
			System.out.printf(Elemento.Valor + " ");
			Elemento = Elemento.prox;
		}
		System.out.println("\n");
	}
	
}
