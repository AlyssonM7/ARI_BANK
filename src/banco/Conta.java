package banco;


public class Conta {
	private double saldo;
	private Cliente usuario;
	
	public Conta(double saldo, Cliente usuario) {
		this.saldo = saldo;
		this.usuario = usuario;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public Cliente getUsuario() {
		return usuario;
	}
	
	public void depositar(double valor) {
	    this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
	    if (valor > this.saldo) {
	        return false;
	    } else {
	        this.saldo -= valor;
	        return true; 
	    }
	}
	 
}