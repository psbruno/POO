package CharSequence;

public class Main {
	public static void main(String args[]) {
		CharSequence sequence = new opsChar();
		
		((opsChar)sequence).setSequence("Sequencia");
		
		System.out.println("4 primeiros caracteres invertidos: " +
				((CharSequence)sequence).subSequence(0,4));
		
		System.out.println("9 primeiros caracteres invertidos: " +
				((CharSequence)sequence).subSequence(0,9));
	
	}
}
