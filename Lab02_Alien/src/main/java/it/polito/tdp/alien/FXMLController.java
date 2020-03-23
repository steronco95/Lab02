package it.polito.tdp.alien;

import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLController {

	AlienDictionary ad = new AlienDictionary();
	private List<Word> word = new ArrayList<>();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInserisci;

    @FXML
    private Button btnTranslate;

    @FXML
    private ImageView alienImage;

    @FXML
    private TextArea txtVisualizza;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {

    	txtVisualizza.clear();
    	word.clear();
    	ad.clear();
    	
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	
    	String inserimento = txtInserisci.getText();
		
		String [] ins = inserimento.split(" ");
		
		String parola = null;
		String traduzione = null;
		
		txtVisualizza.clear();
		
		if(ins.length==2) {
			parola = ins[0];
			 traduzione = ins[1];
		}else if(ins.length == 1){
			parola = ins[0];
			 
			
		}
		
		
		Word tempW = null;
		
		for(Word w1 : word) {
			if(w1.getParola().equals(parola)) {
				tempW = w1;
				break;
			}
		}
		
		if(tempW != null) {
			if(traduzione != null) {
				tempW.addTranslate(traduzione);
				txtVisualizza.appendText("traduzione aggiunta!");
			}else {
				txtVisualizza.appendText(ad.getTraduzione(tempW));
			}
		}else {
			if(traduzione != null) {
				Word w = new Word(parola);
				w.addTranslate(traduzione);
				ad.addWord(w);
				word.add(w);
				txtVisualizza.appendText("aggiunta nuova parola con relativa traduzione!");
			}else {
				txtVisualizza.appendText("parola non presente nel dizionario!");
			}
		}
    	
    	
    	
    	
    	
    }

    @FXML
    void initialize() {
        assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert alienImage != null : "fx:id=\"alienImage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVisualizza != null : "fx:id=\"txtVisualizza\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        

    }
}
