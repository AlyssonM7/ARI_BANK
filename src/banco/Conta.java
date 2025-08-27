package banco;

public class Conta {
	int numero;
	String titular;
	float saldo;
	
	public void depositar(float valor) {
		saldo += valor;
		
	}
	
	public void sacar(float valor) {
		saldo -= valor;

	}

	public void mostarSaldo() {
		System.out.println("Seu saldo é: " + saldo);
		
	}
	
}
