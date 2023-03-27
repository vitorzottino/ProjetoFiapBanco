package br.com.banco;

import java.lang.Exception;

public class SaldoInsuficiente extends Exception {

	SaldoInsuficiente(String msgErro) {
		super(msgErro);
	}

}
