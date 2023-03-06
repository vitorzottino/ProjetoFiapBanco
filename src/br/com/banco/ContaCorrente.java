package br.com.banco;

public class ContaCorrente extends Conta {

	double saldoInvestimento; // Atributo ContaCorrente

	public ContaCorrente(long id, Cliente cliente) {
		super(id, cliente); // faz referencia ao construtor da classe mae
		this.saldoInvestimento = 0.0;
	}

	public void investir(double valor, Produto produto) {
		
		boolean teste = this.sacar(valor);
		if(teste)
			this.saldoInvestimento += produto.investir(valor);
		  	
	}
	
	public void resgatar (double valor) /* throws SaldoInsuficiente */{
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.depositar(valor);
		} 
		/*else {
			throw new SaldoInsuficiente("Saldo de Investimento insuficiente")
		} */
	}

	@Override
	public void exibirSaldo() {
		double saldoTotal = this.balance + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getName());
		System.out.println("Saldo Conta Corrente: R$" + this.balance);
		System.out.println("Saldo Investimento: R$" + this.saldoInvestimento);
		System.out.println("Saldo total: R$ " + saldoTotal + "\n");
		
		
		
	}

}
