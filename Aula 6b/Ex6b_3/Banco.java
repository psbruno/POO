package Ex6b_3;
import java.util.ArrayList;

public class Banco{
	
	ArrayList <Conta> Contas = new ArrayList<Conta>();	
	
	public void CriaConta(int n){
		Conta SConta = new Conta(n);
		Contas.add(SConta);
	}
	
	
	public void atualiza(double limite) {
		Conta conta;
		for(int i=0;i<Contas.size(); i++) {
			if(Contas.get(i) instanceof ContaPoupanca) {
				Contas.get(i).debita((((ContaPoupanca)Contas.get(i)).getJuros()));
			}else if(Contas.get(i) instanceof ContaCorrente) {
				if(((ContaCorrente)Contas.get(i)).getLimite()<=limite)
					System.out.println("Enviando Carta");
			}
		}
	}
	
	public void CriaCC(int n, double l) {
		Conta CC = new ContaCorrente(n,l);
		Contas.add(CC);
	}
	
	
	public void CriaCP(int n) {
		Conta CP = new ContaPoupanca(n);
		Contas.add(CP);
	}
	
	public void printSaldos() {
		for(int i=0;i<Contas.size(); i++)
			System.out.println("Numero da conta: " + Contas.get(i).getNumero() + " Saldo: " + Contas.get(i).getSaldo());
	}
}
