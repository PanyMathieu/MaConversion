package com.example.maconversion;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;


public class conversionKGenLBS
{

    @FXML
    private Label errorNumber;
    @FXML
    private TextField somme1;

    @FXML
    private ChoiceBox monnaies;
    @FXML
    private TextField tauxResult;

    @FXML
    private Text currencyError;
    double KG = 0.0011;


@FXML
    public void Calculer() {
       if(NumberOnly()) {
        double total = 0;
        double somme = Integer.parseInt(somme1.getText());
        String monnaie = getCurrency();
        switch (monnaie){
            case "Franc CFA":
                total = somme * franc;
                break;
            case "Euro":
                total = somme * euro;
                break;
            case "Dollars USD" :
                total = somme * Usd ;
                break;
            case "Livre Sterling" :
                total = somme * livreSterling;
                break;
            case "Roupie Indienne" :
                total = somme * roupîeIndienne;
                break;
            case "Dinar Tunisien" :
                total = somme * dinarTunisien;
                break;
            case "dinarAlgerien":
                total = somme * dinarAlgerien;
                break;
            case "Bitcoin":
                total = somme * Bitcoin;
                break;
            case "Polonais":
                total = somme * polonais;
                break;
            case "Rouble":
                total = somme * Rouble;
                break;

        }
        double arrondir = Math.round(total*100.00000)/100.00000;
        tauxResult.setText(arrondir + " $");
System.out.println("user input " + monnaie + " $");

       }
       }

@FXML
    public void Terminer() {
    try {
        Parent racine = FXMLLoader.load(getClass().getResource("MenuController.fxml"));
        Application.getInstance().getStage().getScene().setRoot(racine);

    } catch (IOException exception) {
        System.out.println("Impossible de charger  \n" + exception.getMessage());
    }
}

    public boolean NumberOnly(){
        boolean isnotNumber = false;
             isnotNumber = somme1.getText().toString().chars().allMatch( x -> Character.isDigit(x));
if(!isnotNumber ||  somme1.getText().isBlank())
    errorNumber.setText("Veuillez rentrer un chiffre ");
else
    errorNumber.setText("");

        return isnotNumber;
    }
    public String getCurrency(){
        String monnaie = null;
         monnaie = monnaies.getValue().toString();
            if (monnaie.equals("monnaies") )
                currencyError.setText("Veuillez selectionner une monnaie ");
            else
                currencyError.setText("");

            return  monnaie;
    }
}
