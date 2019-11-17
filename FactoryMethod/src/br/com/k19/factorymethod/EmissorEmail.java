package br.com.k19.factorymethod;

public class EmissorEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando por email a mensagem");
		System.out.println(mensagem);
	}

}
