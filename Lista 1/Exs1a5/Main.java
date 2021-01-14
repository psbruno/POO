package Exs1a5;

public class Main {
	public static void main(String args[]) {
		Mortal human = new Mortal();
		
// ex 1: 
		System.out.println(human.isVivo());
		human.mata();
		System.out.println(human.isVivo());
//ex 2
		System.out.printf("\n\n");
		
		Mortal h2 = new Gato();
		((Gato)h2).mata();
		((Gato)h2).mata();//mata 1x
		((Gato)h2).mata();//2x
		((Gato)h2).mata();//3x
		
		System.out.println("Gato apos 3 mortes : " + h2.isVivo());
		
		((Gato)h2).mata();//4x
		((Gato)h2).mata();//5x
		((Gato)h2).mata();//6x
		((Gato)h2).mata();//7x
		
		System.out.println(h2.isVivo());
		System.out.println("\n\n");
//ex 3
		
		human = new Ramo();//     human 
		((Ramo)human).newDir();//     human->
		h2 = ((Ramo)human).getDir();// human->h2
		((Ramo)h2).newDir();//     human->h2->
		((Ramo)human).newEsq();//    <-human->h2->
		
		
		h2.mata(); // <-human->
		
		System.out.println(human.isVivo()); // human
		System.out.println(((Ramo)human).getDir().isVivo()); //human-> dead
		System.out.println(((Ramo)h2).getDir().isVivo());//  human ->dead->dead
		System.out.println("\n\n");
//ex4
		h2 = new Mortal();
		System.out.println(h2);
		h2 = new Ramo();
		System.out.println(h2);
		h2 = new Gato();
		System.out.println(h2);
		
		
		
		
	}

}
