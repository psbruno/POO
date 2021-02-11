package Ex3;

import java.util.ArrayList;


public class Funcionario{
	private String sobreNome;
	private String nome;
	private String salarioHora;
	private int anosNaEmpresa;
	
	public void Metodo(ArrayList<Funcionario> funcs, int X) {
	int i=0;
		for(i=0;i< funcs.size();i++) {
			if(funcs.get(i).anosNaEmpresa >= X)
				System.out.println(funcs.get(i).nome);
		}
	}
}
