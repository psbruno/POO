package Ex6b_1;

public class ContaPoupanca extends Conta{
	float juros;
	
	public ContaPoupanca(int numero) {
		super(numero);
		juros=0;
	}
	public void addJuros(float valor) {
		juros+=valor;
	}
	public float getJuros() {
		return juros;
	}
	
}
