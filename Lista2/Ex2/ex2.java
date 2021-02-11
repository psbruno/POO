package Ex2;
import java.util.*;

public class ex2 {
	public static void main(String Args[]) {
		int a,i;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> vetor = new ArrayList<Integer>();
	
		while ((a = input.nextInt())!=0 )
			vetor.add(a);
		
		a=0;
		float r=0;
		
		for(i=0; i<vetor.size(); i++)
			r+=vetor.get(i);
		
		System.out.println(r/vetor.size());
		
		input.close();
	}

}
