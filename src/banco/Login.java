package banco;

import java.util.Scanner;

public class Login {
	
	public static Conta coletarDados(Scanner sc) {
		
		System.out.println("Digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Digite sua senha de 6 digitos: ");
		String senha = sc.nextLine();
		
		Conta usuario = new Conta(titular, senha, cpf);
		
		return usuario;
	
	}

}
