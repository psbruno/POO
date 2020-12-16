package Pizzaria;

import java.util.Scanner;

public class Ligacao {
	private int numero;
	private String nome, endereco;
	String telefone;
	private String CPF;
	public String getName() {
		return nome;
	}
	public String getTel() {
		return telefone;
	}
	public void cadastro(String N, String E, String T, String cpf) {
		nome=N;
		endereco=E;
		telefone=T;
		CPF=cpf;
	}

}