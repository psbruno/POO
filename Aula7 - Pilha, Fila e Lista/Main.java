package Aula7;

public class Main {
	public static void main(String args[]) {
		Lista pilha;
		Lista ED;
		Lista lista;
	
		
	
		ED = new Lista("Lista",0);

		
		
		ED.insere(1);
		ED.insere(2);
		ED.insere(3);
		ED.insere(4);
		
		System.out.println("Tipo da ED : " + ED.getNome());
		ED.printLista();
		ED.remove(3);
		ED.remove(6);
		
		System.out.println("Lista Final:");
		
		ED.printLista();
		
		System.out.println("\n");
		lista = ED;
		
		ED = new Pilha(10);
		((Pilha)ED).Push(11);
		((Pilha)ED).Push(12);
		((Pilha)ED).Push(13);
		((Pilha)ED).Push(14);
		((Pilha)ED).Push(15);
		((Pilha)ED).Push(16);
		
		
		
		System.out.println("Tipo da ED : " + ED.getNome());
		
		System.out.printf("Topo : " + ((Pilha)ED).getTopo().getValor() +"\n");
		
		((Pilha)ED).printPilha();
		
		((Pilha)ED).Pop();
		((Pilha)ED).Pop();
		((Pilha)ED).Pop();
		
		System.out.println("Pilha final: ");
		((Pilha)ED).printPilha();
		
		pilha = ED;
		
		ED = new Fila(1);
		((Fila)ED).insere(2);
		((Fila)ED).insere(3);
		((Fila)ED).insere(4);
		((Fila)ED).insere(5);
		((Fila)ED).insere(6);
		
		
		System.out.println("Tipo da ED : " + ED.getNome());
		
		((Fila)ED).printFila();
		System.out.println("\n");
		((Fila)ED).remove();
		((Fila)ED).remove();
		((Fila)ED).remove();
		
		System.out.println("Fila Final");
		((Fila)ED).printFila();
		
	}
}
