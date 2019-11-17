package br.com.k19.abstractfactory.models.cartoes.visa;

import br.com.k19.abstractfactory.models.Receptor;

public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Visa.");
		String mensagem = "Mensagem da Visa";
		return mensagem;
	}

}
