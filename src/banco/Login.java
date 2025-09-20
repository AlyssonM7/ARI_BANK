package banco;

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
		
		cpf = Cliente.formataCPF(cpf);
		
		System.out.println("Digite sua senha de 6 digitos: ");
		String senha = sc.nextLine();
		
		while(senha.length()<6||senha.length()>6) {
			System.out.println("Sua senha deve ter 6 digitos");
			senha = sc.nextLine();
		}
		
		Cliente cliente = new Cliente(titular, senha, cpf);
		Conta usuario = new Conta(0.0, cliente);
		
		return usuario;
	}

}
