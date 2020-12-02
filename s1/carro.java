import java.util.Scanner;

public class Carro {
	String marca;
	String modelo;
	String placa;
	int velocidade;
	public void acelerar(int kmh) {
		System.out.printf("Acelerando o carro para %d\n", kmh+velocidade);
		velocidade = velocidade + kmh;
	}
	public void freiar(int kmh) {
		velocidade -= kmh;
	}
	
	
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		/*Scanner input = new Scanner(System.in);
		carro.marca= input.next();
		carro.modelo = input.next();
		carro.placa = input.next();
		carro.velocidade = input.nextInt();*/
		carro.marca="Chevrolet";
		carro.modelo = "Corsa";
		carro.placa= "AAA-1234";
		carro.velocidade=100;
		
		carro.acelerar(2);
		System.out.printf("Velocidade Máxima: %d\n", carro.velocidade);
		carro.freiar(3);
		System.out.printf("Velocidade Final: %d", carro.velocidade);
		//input.close();
	}
}
