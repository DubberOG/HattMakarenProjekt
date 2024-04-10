
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author William
 */

public class Validering {
 private InfDB idb;   

    
    //Kollar så att fältet inte är tomt
    public static boolean txtFaltTomt(JTextField falt){
        boolean resultat = true;

            if(falt.getText().isEmpty()){
                resultat = false;
                JOptionPane.showMessageDialog(null, "Fyll i nödvändiga fält");
                falt.requestFocus();
            }
        return resultat;
    }
    //Kollar ifall det är en epost som är skriven i fältet.
    public static boolean txtEpostKontroll(JTextField falt){
        boolean resultat = false;
        if(txtFaltTomt(falt)){
            String epost = falt.getText();
            if(epost.contains("@") && epost.indexOf("@") < epost.lastIndexOf(".")){
                resultat = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Fyll i fältet med en Epost");
                falt.requestFocus();
            }}
        return resultat;
    }
    
    public static boolean datumKontroll(JTextField falt){
        boolean resultat = true;
        if(txtFaltTomt(falt)){
            String datum = falt.getText();
            String regex = "\\d{4}-\\d{2}-\\d{2}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(datum);

            if(!matcher.matches()){
                JOptionPane.showMessageDialog(null, "Datumet ska ha formatet yyyy-mm-dd");
                falt.requestFocus();
                resultat = false;
            }}
        return resultat;
    }
    //Kollar först om fältet är tomt och sen kollar så att det är mindre än 10 tecken
    public static boolean losenordKontroll(JTextField falt){
        boolean resultat = false;
        String ord = falt.getText();
        if(txtFaltTomt(falt)){
            if(ord.length() <= 10){
                resultat = true;
            }
        }
        return resultat;
    }
    public static boolean valideraKundID(JTextField falt, InfDB idb) {
    try {
        // SQL-fråga för att kontrollera om det angivna KundID:t finns i tabellen Kund
        String kundFraga = "SELECT KundID FROM Kund WHERE KundID = '" + falt + "'";

        // Utför SQL-frågan för att hämta KundID:t från databasen
        String resultat = idb.fetchSingle(kundFraga);

        // Om resultatet är null betyder det att det angivna KundID:t inte finns i tabellen Kund
        if (resultat == null) {
            return false; // KundID:t är ogiltigt
        } else {
            return true; // KundID:t är giltigt
        }

    } catch (InfException ex) {
        JOptionPane.showMessageDialog(null, "Kunde inte validera KundID:t!");
        System.out.println("Internt felmeddelande" + ex.getMessage());
        return false; // Om ett fel inträffar, anta att KundID:t är ogiltigt
    }
}
    public static boolean valideraProduktID(JTextField falt, InfDB idb) {
    try {
        // SQL-fråga för att kontrollera om det angivna ProduktID:t finns i tabellen Produkt
        String produktFraga = "SELECT ProduktID FROM Produkt WHERE ProduktID = '" + falt + "'";

        // Utför SQL-frågan för att hämta ProduktID:t från databasen
        String resultat = idb.fetchSingle(produktFraga);

        // Om resultatet är null betyder det att det angivna ProduktID:t inte finns i tabellen Produkt
        if (resultat == null) {
            return false; // ProduktID:t är ogiltigt
        } else {
            return true; // ProduktID:t är giltigt
        }

    } catch (InfException ex) {
        JOptionPane.showMessageDialog(null, "Kunde inte validera ProduktID:t!");
        System.out.println("Internt felmeddelande" + ex.getMessage());
        return false; // Om ett fel inträffar, anta att ProduktID:t är ogiltigt
    }
}
    }

