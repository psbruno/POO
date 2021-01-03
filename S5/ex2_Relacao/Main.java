package ex2_Relacao;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Relacao r1 = new Reta();
		Relacao r2 = new Reta();
		
		Scanner input = new Scanner(System.in);
		
		((Reta)r1).setPontos(2, 5);
		((Reta)r2).setPontos(1, 6);
		
		
		if(r1.maiorQue(r2))
			System.out.println("Reta 1 maior que R2");
		
		if(r1.menorQue(r2))
			System.out.println("Reta 1 menor que R2");
		
		if(r2.maiorQue(r1))
			System.out.println("Reta 2 maior que R1");
		
		if(r2.menorQue(r1))
			System.out.println("Reta 2 menor que R1");
		
		
		
		if(r1.igualA(r2))
			System.out.println("R1 igual a R2");
		
		
		input.close();
	
	}
}
