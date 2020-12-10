package exS3;

public class Main {
	public static void main(String args[]) {
		int i=0;
		double sum=0;
		Triangulo triangulo = new Triangulo();
		Retangulo retangulo = new Retangulo();
		Quadrado quadrado[]= new Quadrado[10];
		Contador contador= new Contador();
		Carro carro = new Carro();
		
		System.out.println("Ex1\n");
		triangulo.trianguloDefault();
		System.out.println("Triangulo Default: ");
		triangulo.mostra();
		System.out.printf("\nArea: " + triangulo.area());
		
		triangulo.setLado1(4);
		triangulo.setLado2(3);
		triangulo.setAltura(5);
		
		System.out.println("\n\nTriangulo modificado:\n");
		triangulo.mostra();
		System.out.printf("\nArea: " + triangulo.area());
		
		
		
		System.out.println("\n\nEx2\n");
		
		retangulo.setRetangulo(2, 2);
		
		System.out.printf("Area: " + retangulo.getArea() + "\n");
		System.out.printf("Perimetro: " + retangulo.getPerimetro() + "\n");
		System.out.printf("Relacao entre base e altura: " + retangulo.getRelacao() + "\n");
		if(retangulo.isSquare())
			System.out.println("Eh quadardo\n");
		else
			System.out.println("Eh retangulo");
		retangulo.getDimensoes();
		
		System.out.println("Ex3\n");
		
		
		
		for(i=0;i<10;i++) {
			quadrado[i] = new Quadrado();
			quadrado[i].setLado(Math.random());
			sum+=quadrado[i].getArea();
		}
		
		for(i=0;i<10;i++) 
			System.out.printf("Area quadrado " + i + " : " +  quadrado[i].getArea() + "\n");
		
		
		System.out.printf("\n\nsomatorio das areas: " + sum + "\n");
		
		
		
		
		System.out.println("\nEx4\n");
		
		contador.startN(10);
		System.out.println("Contador inicado em 10");
		contador.increment1();
		System.out.println("contador incrementado em 1 : " + contador.getContador());
		contador.incrementN(10);
		System.out.println("\nContador incrementado em 10: " + contador.getContador());
		contador.decrement1();
		contador.decrementN(14);
		System.out.println("\nContador decrementeado em 1 e 14");
		contador.visualizar();
		
		
		System.out.println("\nEx5\n");
		
		System.out.println("Digite o modelo do carro");
		carro.novo("Fiesta");
		System.out.println("Ligando o carro");
		
		carro.Ligar();

		carro.acelerar(50);
		carro.acelerar(50);
		
		System.out.println("Freiando 20km/h");
		carro.freiar(20);
		
		System.out.println("Numero de vezes que o carro ligou:" + carro.getLigadas());
		System.out.println("Numero de vezes que o carro acelerou: " + carro.getAceleradas());
		System.out.println("Numero de vezes que o carro freou:" + carro.getFreadas());
		System.out.println("Velocidade final: "+ carro.getVelocidade());

	}
}
