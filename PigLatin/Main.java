package PigLatin;

import javax.swing.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String frase = frase = input.nextLine();
		
		StringTokenizer palavra = new StringTokenizer(frase," ");
		String PigLatin;
		
		while(palavra.hasMoreTokens()) {
			PigLatin = palavra.nextToken();
			PigLatin = PigLatin.concat(PigLatin.substring(0, 1));
			PigLatin = PigLatin.substring(1, PigLatin.length());
			PigLatin = PigLatin.concat("ay");
			System.out.println(PigLatin);
		}
		
		
		input.close();
	}
}