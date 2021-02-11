package Ex_11;

import java.util.Random;

public class vetor {
	public vetor(int tamanho) {
		double[] vetor = new double[tamanho];
		Random random = new Random();
		for(int i=0;i< tamanho;i++)
			vetor[i]=random.nextDouble();
		
	}

}
