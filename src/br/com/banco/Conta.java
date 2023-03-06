package br.com.banco;

public abstract class Conta {

	protected Cliente cliente;
	protected long id;
	protected double balance;
	private static int contador;  // static é um atributo apenas para a classe mae
	
	public static void exibirContador() {
		System.out.println("Nº de Contas: " + contador);
	}
	
	public Conta(long id, Cliente cliente) {
		
		this.id = id;
		this.cliente = cliente;
		contador++;
	}

	public boolean sacar(double valor) {
		if ((valor > 0) & (this.balance >= valor)) {
			this.balance -= valor;
			return true;
		}

		return false;
	}

	public void depositar(double valor) {
		if (valor >= 0)
			this.balance += valor;

	}

	public void transferir(double valor, Conta conta) {
		boolean teste = this.sacar(valor);
		if (teste == true)
			conta.depositar(valor);

	}

	public abstract void exibirSaldo(); //modificador abstract força a reescrita nas classes filhas
	

	

}
