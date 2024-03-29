package br.com.banco;


public final class ContaCorrente extends Conta { //final na classe impede de ser herdada

	double saldoInvestimento; // Atributo ContaCorrente

	public ContaCorrente(long id, Cliente cliente) {
		super(id, cliente); // faz referencia ao construtor da classe mae
		this.saldoInvestimento = 0.0;
	}

	public void investir(double valor, Produto produto) throws SaldoInsuficiente{
		
		boolean teste = this.sacar(valor);
		if(teste)
			this.saldoInvestimento += produto.investir(valor);
		else 
			throw new SaldoInsuficiente("Saldo de Investimento insuficiente");
		  	
	}
	
	public void resgatar (double valor)  throws SaldoInsuficiente {
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.depositar(valor);
		} 
		else {
			throw new SaldoInsuficiente("Saldo insuficiente");
		} 
	}

	@Override
	public void exibirSaldo() {
		double saldoTotal = this.balance + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getName());
		System.out.println("Data Abertura: " + this.dataAbertura);
		System.out.println("Data Nascimento: " + this.cliente.getBirthday());
		System.out.println("Saldo Conta Corrente: R$" + this.balance);
		System.out.println("Saldo Investimento: R$" + this.saldoInvestimento);
		System.out.println("Saldo total: R$ " + saldoTotal + "\n");
		
		
		
	}

}
