package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alugueis;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados?");
		int quant = sc.nextInt();
		sc.nextLine();
		
		Alugueis[] alugueis = new Alugueis[10];
		
		for (int i = 0 ; i < quant ; i++) {
		System.out.println("Digite o nome do estudante:");
		String nome = sc.nextLine();
		System.out.println("Digite o email do estudante:");
		String email = sc.nextLine();
		System.out.println("Digite o número do quarto:");
		Integer quarto = sc.nextInt();
		sc.nextLine();
		//alimentando o vetor com os dados digitados
     	alugueis[quarto] = new Alugueis(nome, email);
	     }
	 
		// imprimindo vetores do tipo classe usando get
		for(int i = 0; i < alugueis.length; i++) {
			if (alugueis[i] != null) {
			  System.out.println( i + ": " + alugueis[i].getNome() + "," + alugueis[i].getEmail());
		     }
		}
		sc.close();

	}

}
