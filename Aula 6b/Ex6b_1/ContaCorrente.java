package Ex6b_1;

public class ContaCorrente extends Conta {
	float Limite;
	public	ContaCorrente(int numero, float limite){
		super(numero);
		Limite=limite;
	}
	
	public float getLimite(){
		return Limite;
	}

}
