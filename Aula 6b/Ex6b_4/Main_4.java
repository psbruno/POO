package Ex6b_4;
import java.util.ArrayList;
import java.util.Scanner;


public class Main_4 {
	public static void main(String args[]) {
		Banco banco = new Banco();
		Scanner input = new Scanner(System.in);
		
		boolean crit = true;
		while(crit) {
			System.out.println("Entre com a primeira conta (CC - Numero da conta e limite))");
			banco.AbreCC(input.nextInt(), input.nextDouble());
			System.out.println("Entre com a segunda conta (CP - Numero da conta)");
			banco.AbreCP(input.nextInt());
			System.out.println("Entre com a terceira conta (Numero da conta)");
			banco.AbreConta(input.nextInt());
			System.out.println("entre com  'true' para continuar adicionando contas, 'false' para parar");
			
			crit = input.nextBoolean();
		}
		
		
		banco.printSaldos();
		
		//limite == 10
		
		banco.atualiza(10);
		
		crit = true;
		while(crit) {
			System.out.println("Insira o numero da conta para fechar");
			banco.fechar(input.nextInt());
			System.out.println("Entre com 'true' para fechar mais contas, 'false' para encerrar");
			crit = input.nextBoolean();
		}
		
		banco.printSaldos();
		input.close();
		
	
	}
}
