
//Importer som kommer behöva göras för att ställa SQL-frågor
import oru.inf.InfDB;
import oru.inf.InfException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class Main {
    private static InfDB idb;


    public static void main(String[] args) throws InfException
    {
    try {
        
        idb = new InfDB("Hattmakaren", "3306", "hattmakaren","HTM123");
    }catch (InfException e)
    {
        System.out.println(e);
    }
    }
}

