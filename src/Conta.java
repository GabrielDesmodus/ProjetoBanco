
public class Conta {
	private String nome;
	private String cpf;
	private int agencia;
	private int conta;
	private static double saldo;
	private static double limite;
	
	public Conta(String nome, String cpf, int agencia, int conta, double saldoIni, double limiteIni){
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		saldo=saldoIni;
		limite=limiteIni;
		
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Agência: "+agencia);
		System.out.println("Conta: "+conta);
		System.out.println("Saldo Conta inicial: "+saldo);
		System.out.println("Saldo Limite inicial: "+limite);
	}
	
	public Conta(double mov){
		if(mov <0 && Math.abs(mov)>limite) {
			System.out.println("-------Movimento da Conta---------");
			System.out.println("Valor movimentado: "+mov);
			System.out.println("Saldo da Conta atualizado: "+saldo);
			System.out.println("Saldo do limite atualizado: "+limite);
			System.out.println("Saque Inválido");
		}
		else {
			saldo+=mov;
			limite+=mov;
			System.out.println("-------Movimento da Conta---------");
			System.out.println("Valor movimentado: "+mov);
			System.out.println("Saldo da Conta atualizado: "+saldo);
			System.out.println("Saldo do limite atualizado: "+limite);
		}
		
		
	}
}
