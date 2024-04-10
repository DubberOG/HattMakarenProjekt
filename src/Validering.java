
import java.util.regex.Pattern;
import java.util.regex.*;
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
    //Kollar först ifall fältet är tomt och kontrollerar sen om det är skrivet på rätt format
    //yyyy-mm-dd
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
            //kollar ifall längden är 10 eller mindre antal tecken
            if(ord.length() <= 10){
                resultat = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Lösenordet får max vara 10 tecken");
                falt.requestFocus();
            }
        }
        return resultat;
    }
    }

