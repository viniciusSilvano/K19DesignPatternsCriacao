package br.com.k19.abstractfactory.models.cartoes.factory;

import br.com.k19.abstractfactory.models.Emissor;
import br.com.k19.abstractfactory.models.Receptor;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
