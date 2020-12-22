package Ex6b_1;

public class Main_1 {
	public static void main(String args[]) {
		ContaPoupanca Conta1 = new ContaPoupanca(999);
		ContaCorrente Conta2 = new ContaCorrente(444,1000);
	
		
	
	
	System.out.println("Numero Conta Poupanca : " + Conta1.getNumero());
	System.out.println("Numero Conta Corrente : " + Conta2.getNumero());
	System.out.println("Limite : " +Conta2.getLimite());
	
	}
}	
