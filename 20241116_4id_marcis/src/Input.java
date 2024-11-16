
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Input {
     private char[] array_stringa = new char[30]; //creazione dell'array dove verrà inserita la parola dell'utente  
    public void input(){
    //scanner che chiede all'utente la parola 
    Scanner input_Stringa = new Scanner(System.in);
    String stringa;
    System.out.println("inserisci una parola "); 
    stringa = input_Stringa.nextLine(); 
    
    for (int i = 0; i < stringa.length(); i++) { //inserisce la parola dell'utente in un array
            //riempimento dell'array con la parola dell'utente 
            array_stringa[i] = stringa.charAt(i);
            //charAt è una funzione predefinita che ti fornisce il carattere che si trova in questo caso nella posizione i 
        }
    
  
 
    }
    //metodo get che ci fornirà l'array nella classe RicorrenzaA
    public char[] getarray(){
        return array_stringa;
    

    
}
}
