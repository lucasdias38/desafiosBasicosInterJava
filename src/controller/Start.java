package controller;

import java.util.Scanner;

import services.desafios;

public class Start {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
	    
		System.out.println("Lista de desafios");
		System.out.println("1) - Desafio Mesada do Sobrinho!");
		System.out.println("2) - Desafio Download de Pacotes!");
		System.out.println("3) - Desafio Leitura da Gertrudes!");
		System.out.println("4) - Desafio Lojinha de Doces!");
		System.out.println("5) - Desafio Industria da Multa!");
		System.out.println("Digite o numero referente ao desafio que deseja executar:");
		
		int entrada = leitor.nextInt();
		System.out.println("\n");
		switch (entrada) {
		case 1:
			desafios.mesadaSobrinho();
			System.out.println("\nPrograma Encerrado!\n");
			break;
		case 2:
			desafios.downloadPacotes();
			System.out.println("\n\nPrograma Encerrado!\n");
			break;
		case 3:
			desafios.leituraGertrudes();
			System.out.println("\nPrograma Encerrado!\n");
			break;
		case 4:
			desafios.lojinhaDoces();
			System.out.println("\nPrograma Encerrado!\n");
			break;
		case 5:
			desafios.industriaMulta();
			System.out.println("\nPrograma Encerrado!\n");
			break;
		default:
			System.out.println("Opção inválida!\n Programa Encerrado!");
			break;
		}
		
	}
}
