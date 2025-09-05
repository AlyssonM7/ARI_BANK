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

	public static void exibirInvestimentos() {
		
		System.out.println("------ MENU BANCO ------");

		System.out.println("1 - CDBs:");
		System.out.println("0 - Retornar");
	}

	public static void mostrarCDBs12Meses() {
		
		System.out.println("ARI - CDB 360 dias");
		System.out.println("Emissor : Banco ARI");
		System.out.println("Rentabilidade: 15.50% aa");
		System.out.println("Aplicação minima: R$ 1,00");
		System.out.println("Prazo: 360 dias");
		System.out.println("Regate Antecipado : Inativo");
		System.out.println("Imposto de Renda: Até o talo 250%");
		System.out.println("Liquidez: No vencimento");
		System.out.println("Grau de Risco : Baixo");
		
		}

		public static void mostrarCDBs6Meses() {
		
		System.out.println("ARI - CDB 180 dias");
		System.out.println("Emissor : Banco ARI");
		System.out.println("Rentabilidade: 14.50% aa");
		System.out.println("Aplicação minima: R$ 1,00");
		System.out.println("Prazo: 180 dias");
		System.out.println("Regate Antecipado : Inativo");
		System.out.println("Imposto de Renda: Até o talo 250%");
		System.out.println("Liquidez: No vencimento");
		System.out.println("Grau de Risco : Baixo");
			
	}

	public static void opcoesInvestimento(){
		System.out.println("------ MENU BANCO ------");
		
		System.out.println("1 - Investir CDB12Mese. ");
		System.out.println("2 - Investir CDB6Meses. ");
		System.out.println("0- Retornar. ");
	}

}