package br.com.k19.builder.teste;

import br.com.k19.builder.Boleto;
import br.com.k19.builder.BoletoBuilder;
import br.com.k19.builder.GeradorDeBoleto;
import br.com.k19.builder.BB.BBBoletoBuilder;

public class TestaGeradorDeBoleto {

	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}

}
