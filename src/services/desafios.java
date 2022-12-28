package services;

import java.util.Scanner;

public class desafios {

	public static void mesadaSobrinho() { 
		System.out.println("Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo "
				+ "50 reais por mês, ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, "
				+ "durante alguns meses. E você, como um bom tio com habilidades de programação, vai criar um "
				+ "programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade de "
				+ "dinheiro que ele terá em X meses.");
		System.out.println("Insira a quantidade de meses que irá poupar: \n");
		
		Scanner leitor = new Scanner(System.in);
	    int entrada = leitor.nextInt();
	    int mesada = 50;
	    
		System.out.println(mesada * entrada);
	}
	
	public static void downloadPacotes() {
		System.out.println("Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para "
				+ "você fazer foi o contador de porcentagem de download dos pacotes. Mas como o espaço para essa "
				+ "informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1. Então a escala será "
				+ "1 = 10%, 2 = 20%, 3 = 30% e etc.\r\n"
				+ "Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.");
		System.out.println("Insira um número que representará a porcentagem: \n");
		
		Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
		for(int i = 0; i < tamanho; i++) {
			System.out.print("/");
		}
	}
	
	public static void leituraGertrudes() {
		System.out.println("Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que "
				+ "dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria "
				+ "para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou "
				+ "para ajudá-la com esse desenvolvimento.");
		System.out.println("Insira o número de páginas de um determinado livro: \n");
		
		Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        System.out.println(paginas/paginasLidas + " dias");
	}
	
	public static void lojinhaDoces() {
		System.out.println("Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. Para aumentar "
				+ "as vendas o dono resolveu colocar uma máquina onde os clientes, principalmente as crianças que "
				+ "estão muito acostumadas com a tecnologia, poderiam colocar suas moedas e receber dois doces "
				+ "aleatórios. Cada 1 real irá render 2 doces aleatórios.");
		System.out.println("Insira a quantidade de dinheiro que cada cliente, um por vez, possui: \n");
		
		Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        System.out.println("O cliente obteve "+ doce*2 +" doces");
	}
	
	public static void industriaMulta() {
		System.out.println("A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da "
				+ "velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente "
				+ "movimentada e a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse "
				+ "a velocidade permitida de 60km/h.\r\n"
				+ "\r\n"
				+ "O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma "
				+ "mensagem dizendo se o motorista será multado ou não.");
		System.out.println("Insira  a velocidade do motorista: \n");
		
		Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
		
		if(velocidadeAtual > 60)
        	System.out.println("Foi multado");
        else
        	System.out.println("Nao foi multado");
		
	}
}
