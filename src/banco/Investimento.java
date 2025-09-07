package banco;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Investimento{
    Scanner sc = new Scanner(System.in);
    public double saldoInvestimento = 0;
  
   public  void aplicacaoCDB12meses() {
		
		System.out.println("Informe o valor da aplicação: ");
		double aplicacao =sc.nextDouble();
		
		//Condição para investimento.
		if(aplicacao < Conta.saldo){
		System.out.println("Não foi possivel realizar a aolicação, saldo insuficiente");
		
		}else {
			
			// Calculando retorno
			double retorno = aplicacao + ( aplicacao * 15.50/100);
			
			// Tempo de investimento 
			LocalDate hoje = LocalDate.now();
			LocalDate apos12Meses = hoje.plusYears(1);
			
			//Criando ID da operação
			Random rand = new Random();
			int id = rand.nextInt();
				
				if(id < 0) {
					id= id * (-1);
				}else {
					id=id * 1;
				}
			
			//Atribuindo o valor investido para saldoInvestimento.
			saldoInvestimento = saldoInvestimento +  aplicacao; 
			
			System.out.println("----- Aplicação realizada com Sucesso! -----");
			System.out.println("");
			System.out.println("Valor da aplicação: " + aplicacao);
			System.out.println("Transação : " + id);
			System.out.println("Data: " + hoje);
			System.out.println("Vencimento: " + apos12Meses);
			System.out.println("Liquidez : " + retorno);
				
		}
	
	}

    public  void aplicacaoCDB6meses() {
		System.out.println(" --- Aplicação CDB 6 Meses --- ");
		System.out.println("Informe o valor da aplicação: ");
		double aplicacao2 =sc.nextDouble();
		
		//Condição para investimento.
		if(Conta.saldo < aplicacao2){
		System.out.println("Não foi possivel realizar a aolicação, saldo insuficiente");
		
		}else {
			
			// Calculando retorno
			double retorno = aplicacao2 + ( aplicacao2 * 14.50/100);
			
			// Tempo de investimento 
			LocalDate hoje = LocalDate.now();
			LocalDate apos6Meses = hoje.plusMonths(6);
			
			//Criando ID da operação
			Random rand = new Random();
			int id = rand.nextInt();
				
				if(id < 0) {
					id= id * (-1);
				}else {
					id=id * 1;
				}
			
			//Atribuindo o valor investido para saldoInvestimento.
			saldoInvestimento = saldoInvestimento +  aplicacao2; 
			
			System.out.println("----- Aplicação realizada com Sucesso! -----");
			System.out.println("");
			System.out.println("Valor da aplicação: " + aplicacao2);
			System.out.println("Transação : " + id);
			System.out.println("Data: " + hoje);
			System.out.println("Vencimento: " + apos6Meses);
			System.out.println("Liquidez : " + retorno);

		}

	}

}
