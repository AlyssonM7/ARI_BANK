package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Terminal.exibirCabecalho();
		
		Conta usuario = Login.coletarDados(sc);
		
		Terminal.clearConsole();
		
		Terminal.bemVindo(usuario);
		
		Terminal.pause(sc);
		
		int opcao = 0;
		do {
			
			Terminal.clearConsole();
			
			Terminal.mostrarDados(usuario);
			
			Terminal.exibirOperacoes();
			
			opcao = sc.nextInt();
			switch(opcao) {
			
				case 1:
					Operacoes.depositar(sc, usuario);
					Terminal.pause(sc);
					break;
				case 2:
					Operacoes.sacar(sc, usuario);
					Terminal.pause(sc);
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 0:
					System.out.println("Voce saiu do programa");
					break;
				default :
					System.out.println("Opção inválida. Tente novamente.");
					Terminal.pause(sc);
			}
			
		
		}while(opcao != 0);
			
			
		
		sc.close();
		
	}

}
