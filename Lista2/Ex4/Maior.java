package Ex4;

import java.util.ArrayList;

public class Maior {
	
	
	public int Maior(ArrayList<Integer> vetor) {
		int maior=0;
		int i=0;
		
		for(i=0;i<vetor.size();i++)
			if(maior<vetor.get(i))
				maior = vetor.get(i);
		
		return maior;
	}
	
}
