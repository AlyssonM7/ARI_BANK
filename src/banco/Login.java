package banco;

import java.util.Scanner;

public class Login {
	
	public static Conta coletarDados(Scanner sc) {
		
		System.out.println("Digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		String cpf = sc.nextLine();
		
		while(cpf.lengpackage banco;

import java.util.Scanner;

public class Login {
	
	public static Conta coletarDados(Scanner sc) {
		
		System.out.println("Digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		String cpf = sc.nextLine();
		
		while(cpf.length() > 11|| cpf.length()<11) {
			System.out.println("CPF inválido, tente novamnte: ");
			cpf = sc.nextLine();
		}
		
		cpf = Conta.formataCPF(cpf);
		
		System.out.println("Digite sua senha de 6 digitos: ");
		String senha = sc.nextLine();
		
		while(senha.length()<6||senha.length()>6) {
			System.out.println("Sua senha deve ter 6 digitos");
			senha = sc.nextLine();
		}
		
		Conta usuario = new Conta(titular, senha, cpf);
		
		return usuario;
	
	}

}
th() > 11|| cpf.length()<11) {
			System.out.println("CPF inválido, tente novamnte: ");
			cpf = sc.nextLine();
		}
		
		cpf = Conta.formataCPF(cpf);
		
		System.out.println("Digite sua senha de 6 digitos: ");
		String senha = sc.nextLine();
		
		Conta usuario = new Conta(titular, senha, cpf);
		
		return usuario;
	
	}

}
