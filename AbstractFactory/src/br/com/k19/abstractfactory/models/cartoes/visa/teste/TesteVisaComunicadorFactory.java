package br.com.k19.abstractfactory.models.cartoes.visa.teste;

import br.com.k19.abstractfactory.models.Emissor;
import br.com.k19.abstractfactory.models.Receptor;
import br.com.k19.abstractfactory.models.cartoes.factory.ComunicadorFactory;
import br.com.k19.abstractfactory.models.cartoes.visa.comunicador.VisaComunicadorFactory;

public class TesteVisaComunicadorFactory {

	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		
		String transacao = "Valor=560;Senha123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
