package Ex6;

public class main {
	public static void main(String Args[]) {
		No lista= new No();
		
		lista.insere(lista, 1);
		lista.insere(lista, 2);
		lista.insere(lista, 3);
		lista.insere(lista, 4);
		
		lista.imprime(lista);
		System.out.println();
		System.out.println();
//		lista.remove(lista, 3);
	//	lista.imprime(lista);
		
		
		No inversa = lista.inverte(lista);
		System.out.println();
		System.out.println();
		System.out.println("....");
		inversa.imprime(inversa);
		
		System.out.println(lista.soma(lista));
	}
}
