package Pizzaria;
import java.util.Scanner;

public class Pizzaria {
	public static void main(String[] args) {
		int i=0,atende=0;
		Scanner input = new Scanner(System.in);
		
		
		
		//for(i=0;i<10;i++)
		Ligacao Clientes[] = new Ligacao[5];
		Ligacao ClienteL = new Ligacao();
		for(i=0;i<5;i++)	
			Clientes[i] = new Ligacao();
		
		Clientes[0].cadastro("Joao", "Rua A", "11", "111");
		Clientes[1].cadastro("Paulo", "Rua B", "22", "222");
		Clientes[2].cadastro("Pedro", "Rua C", "33", "333");
		Clientes[3].cadastro("Jose", "Rua D", "44", "444");
		Clientes[4].cadastro("Marcos", "Rua E", "55", "555");
		
		
		System.out.println("Nova Ligacao - Entre com os dados do cliente");
		ClienteL.cadastro(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
		for(i=0;i<5;i++) {
			if(Clientes[i].telefone.equals(ClienteL.telefone)) {
				System.out.print("Cliente já cadastrado");
				break;
			}else if(!Clientes[i].telefone.equals(ClienteL.telefone) && i==4)
				System.out.println("Novo Cliente\n");
		}
		
		
		
		input.close();
		System.out.println("\n\n\n return 0");
	}
}
