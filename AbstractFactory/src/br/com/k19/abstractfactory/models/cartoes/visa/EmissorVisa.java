package br.com.k19.abstractfactory.models.cartoes.visa;

import br.com.k19.abstractfactory.models.Emissor;

public class EmissorVisa implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a Visa:");
		System.out.println(mensagem);
	}

}
