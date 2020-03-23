package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	private List<Word> dictionary = new ArrayList<>();
	
	public void addWord(Word w) {
		dictionary.add(w);
	}

	public String getTraduzione(Word tempW) {
		
		Word w = null;
		
		if(dictionary.contains(tempW)) {
		
			StringBuffer result = new StringBuffer();
			
			for(String s : tempW.getTraduzioni()) {
				result.append(s).append("\n");
			}
			
			return result.toString();
		}
		
		
		return "parola non inserita nel vocabolario!";
	}

	public void clear() {
		
		dictionary.clear();
		
	}
	
	

}
