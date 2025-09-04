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
		
		Terminal.mostrarDados(usuario);
		
		Terminal.clearConsole();
		
		Terminal.mostrarDados(usuario);
		
		Terminal.exibirOperacoes();
			
			
			
		
		sc.close();
		
	}

}
