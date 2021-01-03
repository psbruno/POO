package ex2_Relacao;

public class Reta implements Relacao{
	
	private int pA,pB;
	
	public void setPontos(int a,int b) {
		pA=a;
		pB = b;
	}
	
	public boolean maiorQue(Object b) {
		if(pB-pA > ((Reta)b).pB - ((Reta)b).pA ) {
			return true;
		}
		return false;
	}
	public boolean menorQue(Object b) {
		
		if(pB-pA >= ((Reta)b).pB - ((Reta)b).pA ) {
			return false;
		}
		return true;
	}
	public boolean igualA(Object b) {
		if(pB-pA == ((Reta)b).pB - ((Reta)b).pA ) {
			return true;
		}
		return false;
	}
}
