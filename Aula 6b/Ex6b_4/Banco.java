package Ex6b_4;
import java.util.ArrayList;

public class Banco{
	
	ArrayList <Conta> Contas = new ArrayList<Conta>();	


	
	public void AbreConta(int n){
		Conta SConta = new Conta(n);
		Contas.add(SConta);
	}
	
	public void AbreCC(int n, double l) {
		Conta CC = new ContaCorrente(n,l);
		Contas.add(CC);
	}
	
	
	public void AbreCP(int n) {
		Conta CP = new ContaPoupanca(n);
		Contas.add(CP);
	}
	
	
	
	
	public void fechar(int nConta) {
		for(int i=0; i<Contas.size();i++) {
			if(Contas.get(i).getNumero() == nConta) {
				
				if(Contas.get(i) instanceof ContaPoupanca) {
					Contas.get(i).debita((((ContaPoupanca)Contas.get(i)).getJuros()));
				}
				Contas.remove(i);
				return;
			}
		}
		System.err.println("CONTA NÃO EXISTENTE");
	}
	
	public void atualiza(double limite) {
		
		for(int i=0;i<Contas.size(); i++) {
			if(Contas.get(i) instanceof ContaPoupanca) 
				Contas.get(i).debita((((ContaPoupanca)Contas.get(i)).getJuros()));
			else if(Contas.get(i) instanceof ContaCorrente){
				if(((ContaCorrente)Contas.get(i)).getLimite()<=limite)
					System.out.println("Enviando Carta a conta de numero " + Contas.get(i).getNumero());
			}
	
		}
	
	}
	
	public void printSaldos() {
		for(int i=0;i<Contas.size(); i++) {
			int tam=Contas.get(i).getClass().getName().length();
			System.out.printf("Numero da conta: " + Contas.get(i).getNumero() + " Tipo de conta : " +Contas.get(i).getClass().getName().substring(7,tam) + " Saldo: " + Contas.get(i).getSaldo()+ "\n");
		}
		
	}
}
