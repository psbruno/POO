package Ex7;

public class Ex7 {
	static void imprimeAlgo(int nivel) {
		if(nivel==0)
			System.out.print("*");
		else {
			System.out.print("[");
			imprimeAlgo(nivel-1);
			System.out.print(",");
			imprimeAlgo(nivel-1);
			System.out.print("]");
		}
	}
	
	public static void main(String Args[]) {
		imprimeAlgo(0);
		System.out.println();
		imprimeAlgo(1);
		System.out.println();
		imprimeAlgo(2);
		System.out.println();
		imprimeAlgo(3);
		
		
	}

}
