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

	private List <Word> paroleInserite = new ArrayList<>();
	
	AlienDictionary ad = new AlienDictionary();
	
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

    }

    @FXML
    void doTranslate(ActionEvent event) {

    	String inserimento = txtInserisci.getText();
    	
    	String [] ins = inserimento.split(" ");
    	
    	Word w1 = new Word(ins[0],ins[1]);
    	
    	if(ins.length == 2) {
    		ad.addWord(w1.getAlienWord(), w1.getTranslate());
    	}else if (ins.length == 1) {
    		txtVisualizza.appendText(ad.translateWord(ins[0]));
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
