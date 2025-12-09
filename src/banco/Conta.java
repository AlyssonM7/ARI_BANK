package banco;

import java.util.*;
import java.time.*;

public class Conta {
	private double saldo;
	private Cliente usuario;

	//investimento
	private double saldoInvestimento;
	private double valorInvestido;
	private double retorno;
	private int id = 0;
	
	public static ArrayList<String> investimentos = new ArrayList(); // Explicar!

	
	public Conta(double saldo, Cliente usuario) {
		this.saldo = saldo;
		this.usuario = usuario;
	}
	
	public double getSaldoInvestimento() {
		return saldoInvestimento;
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

	public void cdb6Meses() {
		//taxa 11 % 6 meses
		//taxa 14 % ao Ano
		
		System.out.println("Informe o valor do investimento:");
		valorInvestido = sc.nextDouble();
		
		if(valorInvestido <= this.saldo) {
			saldo = saldo - valorInvestido;
			saldoInvestimento += valorInvestido;
			
			// id da transação
			id= id +1;
			
			// definindo data inicio e fim
			  LocalDate dataInicio = LocalDate.now();
			  LocalDate dataFim = LocalDate.now().plusMonths(6);
			
			// Calculando retorno
			retorno = valorInvestido + (valorInvestido * 0.11); 
			
			 String resumo =  "\n=== CDB 6 MESES ==="
		                + "\nID: " + id
		                + "\nValor: R$ " + valorInvestido
		                + "\nData início: " + dataInicio
		                + "\nData retorno: " + dataFim
		                + "\nRendimento previsto: R$ " + retorno;
			 
			 investimentos.add(resumo);
			 System.out.println(resumo);
			 
			
		}else {
		 System.out.println("Operação não concluida, saldo insuficiente.");
		 
		}
		
	}

	public void cdb12Meses() {
		//taxa 11 % 6 meses
		//taxa 14 % ao Ano
		
		System.out.println("Informe o valor do investimento:");
		valorInvestido = sc.nextDouble();
		
		if(valorInvestido <= this.saldo) {
			
			// Atribuindo o valor do saldo para investimento
			saldo = saldo - valorInvestido;
			saldoInvestimento=+ valorInvestido;
			
			// id da transação
			id= id +1;
			
			// definindo data inicio e fim
			LocalDate  dataInicio = LocalDate.now();
			LocalDate dataFim = LocalDate.now().plusMonths(12);
			
			// Calculando retorno
			retorno = valorInvestido + (valorInvestido * 0.14); 
			
			 String resumo =  "\n=== CDB 12 MESES ==="
		                + "\nID: " + id
		                + "\nValor: R$ " + valorInvestido
		                + "\nData início: " + dataInicio
		                + "\nData retorno: " + dataFim
		                + "\nRendimento previsto: R$ " + retorno;
			 
			 investimentos.add(resumo);
			 System.out.println(resumo);
			
			
			}else {
					System.out.println("Operação cancelada, valor insuficiente.");
					
			}
		
	}

	// Metodo para mostrar os investimentos feitos. Explicar!
	public  void ConsultarInvestimentos() {
		if(investimentos.isEmpty()) {
			System.out.println("Nenhum investimento encontrado.");
		}else {
			System.out.println(" ===== Investimentos =====");
			for (String inv : investimentos) {
				System.out.println(inv);
				System.out.println("--------------------------");
			}
		}
		
	}
	 
}