package br.com.k19.multiton;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Tema {
	private String name;
	private Color corDoFundo;
	private Color corDaFonte;
	
	private static Map<String, Tema> temas = new HashMap<String, Tema>();
	
	public static final String SKY = "Sky";
	public static final String FIRE = "Fire";
	
	static {
		Tema tema1 = new Tema();
		tema1.setName(Tema.SKY);
		tema1.setCorDoFundo(Color.BLUE);
		tema1.setCorDaFonte(Color.BLACK);
		
		Tema tema2 = new Tema();
		tema2.setName(Tema.FIRE);
		tema2.setCorDoFundo(Color.RED);
		tema2.setCorDaFonte(Color.WHITE);
		
		temas.put(tema1.getName(), tema1);
		temas.put(tema2.getName(), tema2);
	}

	public static Tema getInstance(String nomeDoTema) {
		return Tema.temas.get(nomeDoTema);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getCorDoFundo() {
		return corDoFundo;
	}

	public void setCorDoFundo(Color corDoFundo) {
		this.corDoFundo = corDoFundo;
	}

	public Color getCorDaFonte() {
		return corDaFonte;
	}

	public void setCorDaFonte(Color corDaFonte) {
		this.corDaFonte = corDaFonte;
	}
	
	
}
