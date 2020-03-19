package it.polito.tdp.alien;
import java.util.*;


public class AlienDictionary {

	private String alienWord;
	private String translate;
	private Map<String,List<String>> dictionary = new TreeMap<>();
	
	
	public void addWord(String alienWord2, String translate2) {
		
		if(dictionary.containsKey(alienWord2)) {
			dictionary.get(alienWord2).add(translate2);
		}else {
			List<String> translate = new ArrayList<>();
			
			translate.add(translate2);
			
			dictionary.put(alienWord2, translate);
		}
		
		
		
	}


	public String translateWord(String string) {
		
		StringBuffer result = new StringBuffer();
		
		for(String s : dictionary.get(string)) {
			result.append(s).append("\n");
		}
		
		return result.toString();
	}
	
	

	
	
	
	

	
	
}
