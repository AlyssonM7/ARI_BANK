package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Terminal.exibirCabecalho();
		Terminal.pause(sc);
		Terminal.clearConsole();
		
		Conta usuario = Login.coletarDados(sc);
		Terminal.clearConsole();

		Terminal.bemVindo(usuario);
		Terminal.pause(sc);
		
		Operacoes.executarOperacoes(sc, usuario);
		
		sc.close();
		
	}
}