package Exs1a5;

public class Ramo extends Mortal{
	private Ramo Gesq;
	private Ramo Gdir;
	private int flag=0;
	Ramo(){
		Gesq = null;
		Gdir = null;
		flag=1;
	}
	
	public void mata() {
		if(Gesq!=null)
			Gesq.mata();
		if(Gdir!=null)
			Gdir.mata();
		
		super.mata();
		
	}
	public Ramo getDir() {
		return Gdir;
	}
	
	public Ramo getEsq() {
		return Gesq;
	}
	
	public void newDir() {
		Gdir = new Ramo();
	}
	
	public void newEsq() {
		Gesq = new Ramo();
	}
	
	public String toString() {
		return "Ramo";
	}
}
