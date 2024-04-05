
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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

    public Validering(InfDB idb) {
        this.idb = idb;
    }
    
    //Eventuellt Lösenord String
    //Epost string @ och .
    //Textfält string
    //Datum
    //int
    
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
        String epost = falt.getText();
        boolean resultat = false;
        if(epost.contains("@") && epost.indexOf("@") < epost.lastIndexOf(".")){
            resultat = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Fyll i fältet med en Epost");
            falt.requestFocus();
        }
        return resultat;
    }
    
    public static boolean datumKontroll(JTextField falt){
        boolean resultat = true;
        String datum = falt.getText();
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(datum);
        
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Datumet ska ha formatet yyyy-mm-dd");
            falt.requestFocus();
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean intKontroll(JTextField falt){
        boolean resultat = true;
        try{
            String kontroll = falt.getText();
            Integer.parseInt(kontroll);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ange siffror");
            resultat = false;
        }
        return resultat;
    }
}
