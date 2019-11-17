package br.com.k19.abstractfactory.models.cartoes.visa.comunicador;

import br.com.k19.abstractfactory.models.Emissor;
import br.com.k19.abstractfactory.models.Receptor;
import br.com.k19.abstractfactory.models.cartoes.factory.ComunicadorFactory;
import br.com.k19.abstractfactory.models.cartoes.factory.EmissorCreator;
import br.com.k19.abstractfactory.models.cartoes.factory.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator(); 
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}
