package Ex6b_2;
import java.util.ArrayList;
import java.util.Scanner;


public class Main_2 {
	public static void main(String args[]) {
		Banco banco = new Banco();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com 'true' para adicionar conta, 'false' para parar" );
		while(input.nextBoolean()) {
			System.out.println("Entre com a primeira conta (CC - Numero + limite))");
			banco.CriaCC(input.nextInt(), input.nextDouble());
			System.out.println("Entre com a segunda conta (CP - Numero)");
			banco.CriaCP(input.nextInt());
			System.out.println("Entre com a terceira conta (Numero)");
			banco.CriaConta(input.nextInt());
			System.out.println("entre com um 'true' para continuar adicionando contas, 'false' para parar");
		}
		
		banco.printSaldos();
		
		
		input.close();
		
	
	}
}
