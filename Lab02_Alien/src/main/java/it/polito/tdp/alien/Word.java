package it.polito.tdp.alien;

import java.util.*;

public class Word {

	private String parola;
	private List <String> traduzioni = new ArrayList<>();

	public Word(String parola) {
		this.parola = parola;
		
	}

	public String getParola() {
		return parola;
	}

	public void addTranslate(String traduzione) {
		traduzioni.add(traduzione);
		
	}

	public List<String> getTraduzioni() {
		return traduzioni;
	}
	
	

	
	
	

}
