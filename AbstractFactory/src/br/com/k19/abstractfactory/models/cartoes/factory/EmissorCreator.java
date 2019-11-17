package br.com.k19.abstractfactory.models.cartoes.factory;

import br.com.k19.abstractfactory.models.Emissor;
import br.com.k19.abstractfactory.models.cartoes.mastercard.EmissorMastercard;
import br.com.k19.abstractfactory.models.cartoes.visa.EmissorVisa;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	public Emissor create(int tipoDoEmissor) {
		switch(tipoDoEmissor) {
			case VISA:
				return new EmissorVisa();
			case MASTERCARD:
				return new EmissorMastercard();
			default:
				throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
	}
}
