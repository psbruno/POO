package Ex6;

public class No {
		private int dado;
		private No prox;
	
	
	public void insere(No comeco, int novodado) {
		No aux=comeco;
		No novo = new No();
		novo.dado = novodado;
		
		while(aux.prox!=null)
			aux=aux.prox;
		
		novo.prox = aux.prox;
		aux.prox = novo;
	}
	
	public void remove(No comeco, int busca) {
		No aux= comeco;
		
		while(aux.prox!= null && aux.prox.dado!=busca)
			aux=aux.prox;
		
		aux.prox = aux.prox.prox;
	}
	
	public void imprime(No lista) {
		No aux=lista;
		while(aux!=null) {
			System.out.println(aux.dado);
			aux = aux.prox;
		}
			
	}
	
	public No inverte(No lista) {
		No Lista2;
		if(lista.prox!=null)
			Lista2 = lista.inverte(lista.prox);
		else {
			Lista2 = new No();
			Lista2.insere(Lista2, lista.dado);
			return Lista2;
		}
		Lista2.insere(Lista2, lista.dado);
		
		return Lista2;
	}
	
	public int soma(No Lista) {
		if(Lista.prox==null)
			return Lista.dado;
		
		return Lista.soma(Lista.prox)+Lista.dado;
	}
}
