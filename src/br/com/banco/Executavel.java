package br.com.banco;

public class Executavel {
	
	public static void main(String[] args) {

		Cliente Vitor = new Cliente("Vitor", "Av. Paulista", "2003-09-10");		
		ContaCorrente contaVitor = new ContaCorrente(1009, Vitor);
		Cliente Neymar = new Cliente("Neymar", "Av. Paulista", "1992-07-09");
		ContaCorrente contaNeymar = new ContaCorrente(1010, Neymar);
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		Fundos fundos = new Fundos();
		
		
		
		
		
	}
}
