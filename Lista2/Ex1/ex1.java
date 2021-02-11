package Ex1;
import java.util.*;
public class ex1 {
	public static void main(String args[]) {
		int a,i;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		a = input.nextInt();
	
		while ((a = input.nextInt())!=0 )
			vetor.add(a);
		
		Collections.sort(vetor);
		
		System.out.println(vetor);
		
		
	}
}
