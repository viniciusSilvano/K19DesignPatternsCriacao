package br.com.k19.abstractfactory.models.cartoes.mastercard.teste;

import br.com.k19.abstractfactory.models.Emissor;
import br.com.k19.abstractfactory.models.Receptor;
import br.com.k19.abstractfactory.models.cartoes.factory.ComunicadorFactory;
import br.com.k19.abstractfactory.models.cartoes.mastercard.MastercardComunicadorFactory;

public class TesteMastercardComunicadorFactory {
	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
		
		String transacao = "Valor=660;Senha123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
