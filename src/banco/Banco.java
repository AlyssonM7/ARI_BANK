package banco;

import java.util.Scanner;

public class Banco {
	
	public static void pause(Scanner sc) {
	    System.out.println("Pressione a tecla ENTER para continuar...");
	    sc.nextLine();
	}
	
	public static void clearConsole() {
	    for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta c1 = new Conta();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("========== ARI BANK ==========");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Digite o nome do titular da conta: ");
		c1.titular = sc.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		c1.cpf = sc.nextLine();
		
		while(c1.cpf.length() > 11|| c1.cpf.length()<11) {
			System.out.println("CPF inválido, tente novamnte: ");
			c1.cpf = sc.nextLine();
		}
		c1.cpf = c1.formataCPF(c1.cpf);
		
		System.out.println("Digite sua senha de 6 digitos: ");
		c1.senha = sc.nextLine();
		String senhaVRF; 
		while(c1.senha.length()<6||c1.senha.length()>6) {
			System.out.println("Sua senha deve ter 6 digitos");
			c1.senha = sc.nextLine();
		}
		
		clearConsole();
		
		System.out.printf("Bem - vindo %s!!\n",c1.titular);
		System.out.println(" ");
		System.out.println(" ");
	
		c1.saldo = 0;
		pause(sc);
		
		int op;
		
		do {
		
			clearConsole();
			c1.mostrarDados();
			Menu.exibir();
			
			op = sc.nextInt();
			
			sc.nextLine();
			
			switch(op) {
			
			case 1:
				clearConsole();
				float deposito;
				System.out.println("digite o valor que deseja depositar: ");
				deposito = sc.nextFloat();
				sc.nextLine();
				System.out.println("Digite sua senha: ");
				senhaVRF = sc.nextLine();
				while(senhaVRF.equals(c1.senha)== false) {
					System.out.println("Senha incorreta. Tente novamete: ");
					senhaVRF = sc.nextLine();
				}
				clearConsole();
				c1.depositar(deposito);
				sc.nextLine();
				break;
				
			case 2:
				clearConsole();
				float saque;
				if(c1.saldo == 0) {
					System.out.println("Você não possui saldo para sacar. Realize um depósito");
				    pause(sc);
				}
				else {
					System.out.println("Digite o valor que deseja sacar: ");
					saque = sc.nextFloat();
					sc.nextLine();
					while(saque > c1.saldo) {
						System.out.println("Saldo insuficiente para completar o saque. Digite outro valor: ");
						saque = sc.nextFloat();
						sc.nextLine();
					}
					System.out.println("Digite sua senha: ");
					senhaVRF = sc.nextLine();
					while(senhaVRF.equals(c1.senha)== false) {
						System.out.println("Senha incorreta. Tente novamete: ");
						senhaVRF = sc.nextLine();
					}
					clearConsole();
					c1.sacar(saque);
					sc.nextLine();
				}
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 0:
				System.out.println("Você encerrou o programa.");
				break;
				
			default: 
				System.out.println("Opção invalida, tente novamente.");
				break;
				
			}
			
		}while(op != 0);
		
		sc.close();
		
	}

}
