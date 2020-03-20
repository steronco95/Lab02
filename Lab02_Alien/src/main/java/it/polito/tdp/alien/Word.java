package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class Word {

	private String alienWord;
	private List <String>  translate = new ArrayList<>();
	private String traduzione;
	
	public Word(String string) {
		this.alienWord = string;
	}

	public void addWord(String string) {
		
		translate.add(string);
		
	}

	public String getAlienWord() {
		return alienWord;
	}

//	public List<String> getTranslate() {
//		return translate;
//	}
	
	public boolean equals (String parola) {
		
		return parola.equals(alienWord);
	}

	public void addTranslate(String string) {
		this.traduzione = string;
		
	}
	
	public String getTranslate() {
		return traduzione;
	}
	
	
	
	
	

	
	
	

}
