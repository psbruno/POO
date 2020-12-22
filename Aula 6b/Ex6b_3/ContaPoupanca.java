package Ex6b_3;

public class ContaPoupanca extends Conta{
	float juros;
	
	public ContaPoupanca(int numero) {
		super(numero);
		juros=10;
	}
	public void addJuros(float valor) {
		juros+=valor;
	}
	public float getJuros() {
		return juros;
	}
	
}
