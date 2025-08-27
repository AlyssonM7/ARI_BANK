package banco;

import java.util.Scanner;

public class Banco {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta c1 = new Conta();
		
		System.out.println("Digite o nome do titular da conta: ");
		c1.titular = sc.nextLine();
		
		System.out.println("Digite o numero da conta: ");
		c1.numero = sc.nextInt();
		
		c1.saldo = 0;
		
		int op;
		
		do {
			
			System.out.println("Para depositar digite - 1");
			System.out.println("Para sacar digite - 2");
			System.out.println("Para mostrar seu saldo digite - 3");
			System.out.println("Digite 0 para encerrar o programa.");
			
			op = sc.nextInt();
			
			
			switch(op) {
			case 1:
				float deposito;
				System.out.println("digite o valor que deseja depositar: ");
				deposito = sc.nextFloat();
				c1.depositar(deposito);
				break;
			case 2:
				float saque;
				System.out.println("Digite o valor que deseja sacar: ");
				saque = sc.nextFloat();
				c1.sacar(saque);
				break;
			case 3:
				c1.mostarSaldo();
				break;
			case 0:
				System.out.println("voce encerrou o programa.");
				break;
			default: 
				System.out.println("Opcao invalida, tente novamente.");
				break;
				
			}
			
		}while(op != 0);
		
		sc.close();
		
	}

}
