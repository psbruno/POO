package Ex6b_2;
import java.util.ArrayList;

public class Banco{
	
	ArrayList <Conta> Contas = new ArrayList<Conta>();	
	
	public void CriaConta(int n){
		Conta SConta = new Conta(n);
		Contas.add(SConta);
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
