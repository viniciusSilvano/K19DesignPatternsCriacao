package br.com.k19.factorymethod.factory;

import br.com.k19.factorymethod.Emissor;
import br.com.k19.factorymethod.EmissorEmail;
import br.com.k19.factorymethod.EmissorJMS;
import br.com.k19.factorymethod.EmissorSMS;

public class EmissorCreator {
	public Emissor create(int tipoDeEmissor) {
		switch(tipoDeEmissor) {
			case 0:
				return new EmissorSMS();
			case 1:
				return new EmissorEmail();
			case 2:
				return new EmissorJMS();
			default:
				throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}
