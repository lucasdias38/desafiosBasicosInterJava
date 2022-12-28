package services;

import java.util.Scanner;

public class desafios {

	public static void mesadaSobrinho() { 
		System.out.println("Seu sobrinho come�ou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo "
				+ "50 reais por m�s, ele quer saber quanto ter� se juntar todo o dinheiro, sem gastar nada, "
				+ "durante alguns meses. E voc�, como um bom tio com habilidades de programa��o, vai criar um "
				+ "programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade de "
				+ "dinheiro que ele ter� em X meses.");
		System.out.println("Insira a quantidade de meses que ir� poupar: \n");
		
		Scanner leitor = new Scanner(System.in);
	    int entrada = leitor.nextInt();
	    int mesada = 50;
	    
		System.out.println(mesada * entrada);
	}
	
	public static void downloadPacotes() {
		System.out.println("Voc� foi contratado para criar um gerenciador de pacotes. Por�m, o que restou para "
				+ "voc� fazer foi o contador de porcentagem de download dos pacotes. Mas como o espa�o para essa "
				+ "informa��o ficou pequeno, a empresa optou por fazer uma escala de 10 � 1. Ent�o a escala ser� "
				+ "1 = 10%, 2 = 20%, 3 = 30% e etc.\r\n"
				+ "Para cada 10% de download, o programa deve printar, em sequ�ncia e sem espa�os, uma barra �/�.");
		System.out.println("Insira um n�mero que representar� a porcentagem: \n");
		
		Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
		for(int i = 0; i < tamanho; i++) {
			System.out.print("/");
		}
	}
	
	public static void leituraGertrudes() {
		System.out.println("Sua tia Gertrudes � uma leitora ass�dua. E ela gostaria de ter um aplicativo que "
				+ "dissesse para ela, de acordo com o n�mero de p�ginas de um livro, quanto tempo ela levaria "
				+ "para ler lendo apenas 3 p�ginas por dia. Como voc� est� aprendendo Java, voc� se disponibilizou "
				+ "para ajud�-la com esse desenvolvimento.");
		System.out.println("Insira o n�mero de p�ginas de um determinado livro: \n");
		
		Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        System.out.println(paginas/paginasLidas + " dias");
	}
	
	public static void lojinhaDoces() {
		System.out.println("Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. Para aumentar "
				+ "as vendas o dono resolveu colocar uma m�quina onde os clientes, principalmente as crian�as que "
				+ "est�o muito acostumadas com a tecnologia, poderiam colocar suas moedas e receber dois doces "
				+ "aleat�rios. Cada 1 real ir� render 2 doces aleat�rios.");
		System.out.println("Insira a quantidade de dinheiro que cada cliente, um por vez, possui: \n");
		
		Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        System.out.println("O cliente obteve "+ doce*2 +" doces");
	}
	
	public static void industriaMulta() {
		System.out.println("A prefeitura de uma cidade A instalou uma c�mera para verificar quem estava acima da "
				+ "velocidade permitida na rodovia da entrada da cidade. Por�m, ela � uma cidade extremamente "
				+ "movimentada e a prefeitura n�o deu conta de enviar as multas necess�rias para quem ultrapassasse "
				+ "a velocidade permitida de 60km/h.\r\n"
				+ "\r\n"
				+ "O seu papel ser� o de criar um programa que verifique os dados recebidos da c�mera e envie uma "
				+ "mensagem dizendo se o motorista ser� multado ou n�o.");
		System.out.println("Insira  a velocidade do motorista: \n");
		
		Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
		
		if(velocidadeAtual > 60)
        	System.out.println("Foi multado");
        else
        	System.out.println("Nao foi multado");
		
	}
}
