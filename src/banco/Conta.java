package banco;

public class Conta {
	String cpf;
	String titular;
	float saldo;
	String senha;
	
	public void depositar(float valor) {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	    System.out.println(" ");
	    System.out.println("Pressione a tecla ENTER para continuar...");
	    System.out.println(" ");
	    System.out.println(" ");
		
	}
	
	public void sacar(float valor) {
		saldo -= valor;
		System.out.println("Saque realizado com sucesso!");
		System.out.println(" ");
	    System.out.println("Pressione a tecla ENTER para continuar...");
	    System.out.println(" ");
	    System.out.println(" ");


	}

	public void mostrarDados() {
		System.out.println(titular);
		System.out.printf("%s             R$ %.2f\n",cpf,saldo);
		System.out.println(" ");

	}
	
	public String formataCPF(String cpf) {
		char[] cpfArray = new char[14];
		
		int j = 0;
		
		for(int i = 0; i < 14;i++){
			if(i == 3|| i == 7) {
				cpfArray[i] = '.';
			}
			else if(i == 11) {
				cpfArray[i] = '-';
			}
			else {
				cpfArray[i]=cpf.charAt(j);
				j++;
			}
				
		}
		cpf = new String(cpfArray);
		return cpf;
		
	}

	public void validaSenha(String senhaVRF) {
		
		
	}
}
