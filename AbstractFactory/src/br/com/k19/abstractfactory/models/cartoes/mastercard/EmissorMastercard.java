package br.com.k19.abstractfactory.models.cartoes.mastercard;

import br.com.k19.abstractfactory.models.Emissor;

public class EmissorMastercard implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a Mastercard:");
		System.out.println(mensagem);
	}

}
