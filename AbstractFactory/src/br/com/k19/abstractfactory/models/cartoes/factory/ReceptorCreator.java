package br.com.k19.abstractfactory.models.cartoes.factory;

import br.com.k19.abstractfactory.models.Receptor;
import br.com.k19.abstractfactory.models.cartoes.mastercard.ReceptorMastercard;
import br.com.k19.abstractfactory.models.cartoes.visa.ReceptorVisa;

public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	public Receptor create(int tipoDoReceptor) {
		switch(tipoDoReceptor) {
			case VISA:
				return new ReceptorVisa();
			case MASTERCARD:
				return new ReceptorMastercard();
			default:
				throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
	}
}
