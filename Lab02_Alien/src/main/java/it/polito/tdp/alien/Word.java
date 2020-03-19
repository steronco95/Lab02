package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class Word {

	private String alienWord;
	private String translate;
	private List <String> aw = new ArrayList<>();
	

	public Word(String alienWord, String translate) {
		this.alienWord = alienWord;
		this.translate = translate;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslate() {
		return translate;
	}
	
	
	

}
