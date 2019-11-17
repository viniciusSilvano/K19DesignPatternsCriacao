package br.com.k19.abstractfactory.models.cartoes.mastercard;

import br.com.k19.abstractfactory.models.Emissor;
import br.com.k19.abstractfactory.models.Receptor;
import br.com.k19.abstractfactory.models.cartoes.factory.ComunicadorFactory;
import br.com.k19.abstractfactory.models.cartoes.factory.EmissorCreator;
import br.com.k19.abstractfactory.models.cartoes.factory.ReceptorCreator;

public class MastercardComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator ReceptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.MASTERCARD);
	}

	@Override
	public Receptor createReceptor() {
		return ReceptorCreator.create(ReceptorCreator.MASTERCARD);
	}

}
