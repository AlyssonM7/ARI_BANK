package banco;

import java.util.Scanner;

public class Operacoes {
	
	public static void depositar(Scanner sc, Conta usuario) {
	    System.out.println("Digite o valor que deseja depositar: ");
	    double valor = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Digite sua senha: ");
	    String senhaDigitada = sc.nextLine();
	    
	    while (!senhaDigitada.equals(usuario.getUsuario().getSenha())) {
	        System.out.println("Senha incorreta. Tente novamente: ");
	        senhaDigitada = sc.nextLine();
	    }
	    
	    usuario.depositar(valor);
	    
	    System.out.println("Depósito realizado com sucesso!");
	}
	
	
	public static void sacar(Scanner sc, Conta usuario) {
	   
	    System.out.println("Digite o valor que deseja sacar: ");
	    double valor = sc.nextDouble();
	    sc.nextLine(); 
	    
	    System.out.println("Digite sua senha: ");
	    String senhaDigitada = sc.nextLine();

	    while (!senhaDigitada.equals(usuario.getUsuario().getSenha())) {
	        System.out.println("Senha incorreta. Tente novamente: ");
	        senhaDigitada = sc.nextLine();
	    }
	    if (usuario.sacar(valor)) {
	        System.out.println("Saque realizado com sucesso!");
	    } else {
	        System.out.println("Saldo insuficiente para realizar o saque.");
	    }
	}
	
	public static void executarOperacoes(Scanner sc,Conta usuario) {
		int opcao = 0;
		do {
			Terminal.clearConsole();
			
			Terminal.mostrarDados(usuario);
			
			Terminal.exibirOperacoes();
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					depositar(sc, usuario);
					Terminal.pause(sc);
					break;
				case 2:
					sacar(sc, usuario);
					Terminal.pause(sc);
					break;
				case 3:
					Terminal.exibirInvestimento();
					System.out.println("Opção: ");
					int opcaoInvestimento = sc.nextInt();
					switch(opcaoInvestimento) {
					case 1 -> usuario.cdb12Meses();
					case 2 -> usuario.cdb6Meses();
					case 3 -> usuario.ConsultarInvestimentos();
					default -> System.out.println("Opção inválida. Tente novamente.");
					}
					sc.nextLine();
					Terminal.pause(sc);
					break;
				case 4:
					//ConversorDeMoeda.converterMoeda(sc, usuario);
					Terminal.pause(sc);
					break;
				case 0:
					System.out.println("Você saiu do programa");
					break;
				default :
					Terminal.clearConsole();
					System.out.println("Opção inválida. Tente novamente.");
					Terminal.pause(sc);
			}
		}while(opcao != 0);
	}
}
