package CharSequence;

public class opsChar implements CharSequence {
	private String Sequence;
	public void setSequence(String sequence) {
		Sequence = new StringBuilder(sequence).reverse().toString();
	}
	
	
	public char charAt(int index) {
		return Sequence.charAt(index);
	}
	public int length() {
		return Sequence.length();
	}
	public String subSequence(int start, int end) {
		return Sequence.substring(start, end);
	}
 	public String toString() {
 		return Sequence.toString();
 	}
}
