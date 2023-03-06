package br.com.banco;

import java.text.ParseException;

public class Executavel {
	
	public static void main(String[] args) throws ParseException {

		Cliente Vitor = new Cliente("Vitor", "Av. Paulista", "10/09/2003");		
		ContaCorrente contaVitor = new ContaCorrente(1009, Vitor);
		Cliente Neymar = new Cliente("Neymar", "Av. Paulista", "09/07/1992");
		ContaCorrente contaNeymar = new ContaCorrente(1010, Neymar);
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		Fundos fundos = new Fundos();
		
		
		contaVitor.exibirSaldo();
		
		
	}
}
