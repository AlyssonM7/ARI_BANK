package banco;

public class Conta {
	private String cpf;
	private String titular;
	private String senha;
	private float saldo;
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	
	public void depositar(float valor) {
		saldo += valor;
		
	    
	}
	
	public void sacar(float valor) {
		
		saldo -= valor;
	}
	
	public Conta(String titular, String senha, String cpf) {
		this.titular = titular;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = 0.0f;
	}
		
	public static String formataCPF(String cpf) {
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
}