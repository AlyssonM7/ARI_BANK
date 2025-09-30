package banco;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String senha;
	
	public Cliente(String nome, String senha, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
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


