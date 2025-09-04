package banco;

import java.util.Scanner;

public class Operacoes {
	
	public static void depositar(Scanner sc, Conta usuario) {
	    System.out.println("Digite o valor que deseja depositar: ");
	    float valor = sc.nextFloat();
	    sc.nextLine();
	    
	    System.out.println("Digite sua senha: ");
	    String senhaDigitada = sc.nextLine();
	    
	    while (!senhaDigitada.equals(usuario.getSenha())) {
	        System.out.println("Senha incorreta. Tente novamente: ");
	        senhaDigitada = sc.nextLine();
	    }
	    
	    float saldoAtual = usuario.getSaldo();
	    usuario.setSaldo(saldoAtual + valor);
	    
	    System.out.println("Depósito realizado com sucesso!");
	}
	
	
	public static void sacar(Scanner sc, Conta usuario) {
	   
	    System.out.println("Digite o valor que deseja sacar: ");
	    float valor = sc.nextFloat();
	    sc.nextLine(); 
	    
	    System.out.println("Digite sua senha: ");
	    String senhaDigitada = sc.nextLine();

	    while (!senhaDigitada.equals(usuario.getSenha())) {
	        System.out.println("Senha incorreta. Tente novamente: ");
	        senhaDigitada = sc.nextLine();
	    }

	    if (valor > usuario.getSaldo()) {
	        System.out.println("Saldo insuficiente para realizar o saque.");
	    } else {
	        float saldoAtual = usuario.getSaldo();
	        usuario.setSaldo(saldoAtual - valor);
	        System.out.println("Saque realizado com sucesso!");
	    }
	}
}
