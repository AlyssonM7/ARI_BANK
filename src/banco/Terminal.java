package banco;



public class Terminal {
	
	public static void exibirCAbecalho() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("========== ARI BANK ==========");
		System.out.println(" ");
		System.out.println(" ");
	}package banco;

import java.util.Scanner;

public class Terminal {
	
	public static void exibirCabecalho() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("========== ARI BANK ==========");
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public static void mostrarDados(Conta usuario) {
		
		System.out.println(usuario.getTitular());
		System.out.printf("%s             R$ %.2f\n",usuario.getCPF(),usuario.getSaldo());
		System.out.println(" ");

	}

	public static void exibirOperacoes() {
		
		System.out.println("------ MENU BANCO ------");

		System.out.println("1 - Para depositar");
		System.out.println("2 - Para sacar");
		System.out.println("3 - Para acessar a aba de investimentos");
		System.out.println("4 - Para acessar a aba de conversão de moedas");
		System.out.println("0 - Para encerrar o programa.");
	
	} 
	
	public static void bemVindo(Conta usuario) {
		System.out.printf("Bem - vindo %s!!\n",usuario.getTitular());
		System.out.println(" ");
		System.out.println(" ");
	}
	public static void pause(Scanner sc) {
	    System.out.println("Pressione a tecla ENTER para continuar...");
	    sc.nextLine();
	}
	
	public static void clearConsole() {
	    for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}
}

	public static void exibirOperacoes() {
		
		System.out.println("------ MENU BANCO ------");

		System.out.println("1 - Para depositar");
		System.out.println("2 - Para sacar");
		System.out.println("3 - Para acessar a aba de investimentos");
		System.out.println("4 - Para acessar a aba de conversão de moedas");
		System.out.println("0 - Para encerrar o programa.");
	}
}