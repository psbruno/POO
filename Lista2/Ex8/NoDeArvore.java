package Ex8;

public class NoDeArvore {
	int item;
	NoDeArvore esquerda;
	NoDeArvore direita;
	
	NoDeArvore(int num){
		item =num;
		esquerda = null;
		direita = null;
	}
	
	public NoDeArvore insere(NoDeArvore NoAtual, int num){
		if(NoAtual == null) {
			NoAtual = new NoDeArvore(num);
			return NoAtual;
		}
		if(num>NoAtual.item)
			NoAtual.direita = NoAtual.insere(NoAtual.direita, num);
		else
			NoAtual.esquerda = NoAtual.insere(NoAtual.esquerda, num);
		return NoAtual;
	}
	public NoDeArvore Remove(NoDeArvore No) {
		NoDeArvore suc = No.direita;
		while(suc.esquerda!=null)
			suc=suc.esquerda;
		No.item=suc.item;
		suc=suc.direita;
		return No;
	}
	public NoDeArvore busca(NoDeArvore No, int valor) {
		if(No.item==valor)
			return No;
		
		if(No.item>valor)
			No.busca(No.direita, valor);
		else
			No.busca(No.esquerda, valor);
		
		return No;
	}
	
	public int soma(NoDeArvore No) {
		return No.item+No.soma(No.direita)+No.soma(No.esquerda);
	}
}
