package it.polito.tdp.alien;
import java.util.*;


public class AlienDictionary {

	private String alienWord;
	private String translate;
	private List<Word> dictionary = new ArrayList<>();
	

	public void addWord(Word w1) {
		
		dictionary.add(w1);
		
	}
	
	public String translateWord (String alienWord) {
		
		Word tempW = null;
		
		for(Word w : dictionary) {
			if(tempW.getAlienWord().equals(alienWord)) {
				tempW = w;
				break;
			}
		}
		
//		StringBuffer result = new StringBuffer();
//		
//		for(String s : tempW.getTranslate()) {
//			result.append(s).append("\n");
//		}
		
		
		return tempW.getTranslate();
	}
	
	

	
	
	
	

	
	
}
