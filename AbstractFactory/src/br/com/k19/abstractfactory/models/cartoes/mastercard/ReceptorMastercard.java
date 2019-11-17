package br.com.k19.abstractfactory.models.cartoes.mastercard;

import br.com.k19.abstractfactory.models.Receptor;

public class ReceptorMastercard implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Mastercard.");
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
	}

}
