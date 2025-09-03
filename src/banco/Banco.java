package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Terminal.exibirCAbecalho();
		Conta usuario = Login.coletarDados(sc);
		
		/*usuario.titular = sc.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		usuario.cpf = sc.nextLine();
		
		while(usuario.cpf.length() > 11|| usuario.cpf.length()<11) {
			System.out.println("CPF inválido, tente novamnte: ");
			usuario.cpf = sc.nextLine();
		}
		usuario.cpf = usuario.formataCPF(usuario.cpf);
		
		System.out.println("Digite sua senha de 6 digitos: ");
		usuario.senha = sc.nextLine();
		String senhaVRF; 
		while(usuario.senha.length()<6||usuario.senha.length()>6) {
			System.out.println("Sua senha deve ter 6 digitos");
			usuario.senha = sc.nextLine();
		}
		
		clearConsole();
		
		System.out.printf("Bem - vindo %s!!\n",usuario.titular);
		System.out.println(" ");
		System.out.println(" ");
	
		usuario.saldo = 0;
		pause(sc);
		
		int opcao;
		
		do {
		
			clearConsole();
			usuario.mostrarDados();
			Terminal.menuOperacoes();
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				clearConsole();
				float deposito;
				System.out.println("digite o valor que deseja depositar: ");
				deposito = sc.nextFloat();
				sc.nextLine();
				System.out.println("Digite sua senha: ");
				senhaVRF = sc.nextLine();
				while(senhaVRF.equals(usuario.senha)== false) {
					System.out.println("Senha incorreta. Tente novamente: ");
					senhaVRF = sc.nextLine();
				}
				clearConsole();
				usuario.depositar(deposito);
				sc.nextLine();
				break;
				
			case 2:
				clearConsole();
				float saque;
				if(usuario.saldo == 0) {
					System.out.println("Você não possui saldo para sacar. Realize um depósito");
				    pause(sc);
				}
				else {
					System.out.println("Digite o valor que deseja sacar: ");
					saque = sc.nextFloat();
					sc.nextLine();
					while(saque > usuario.saldo) {
						System.out.println("Saldo insuficiente para completar o saque. Digite outro valor: ");
						saque = sc.nextFloat();
						sc.nextLine();
					}
					System.out.println("Digite sua senha: ");
					senhaVRF = sc.nextLine();
					while(senhaVRF.equals(usuario.senha)== false) {
						System.out.println("Senha incorreta. Tente novamete: ");
						senhaVRF = sc.nextLine();
					}
					clearConsole();
					usuario.sacar(saque);
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
			
		}while(opcao != 0);*/
		
		sc.close();
		
	}

}
