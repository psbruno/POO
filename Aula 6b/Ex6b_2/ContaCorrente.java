package Ex6b_2;

public class ContaCorrente extends Conta {
	double Limite;
	public	ContaCorrente(int numero, double limite){
		super(numero);
		Limite=limite;
	}
	
	public double getLimite(){
		return Limite;
	}

}
