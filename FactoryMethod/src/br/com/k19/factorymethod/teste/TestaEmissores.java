package br.com.k19.factorymethod.teste;

import br.com.k19.factorymethod.*;
import br.com.k19.factorymethod.factory.EmissorCreator;

public class TestaEmissores {
	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor1 = creator.create(0);
		emissor1.envia("K19 Treinamentos");
		
		Emissor emissor2 = creator.create(1);
		emissor2.envia("K19 Treinamentos");
		
		Emissor emissor3 = creator.create(2);
		emissor3.envia("K19 Treinamentos");
		
		Emissor emissor4 = creator.create(3);
		emissor4.envia("K19 Treinamentos");
	}
}
