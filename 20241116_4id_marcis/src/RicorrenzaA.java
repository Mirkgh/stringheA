
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class RicorrenzaA {
    //creazione dell'array
  private char[] array = new char[30];
  //creazione del contatore che ci servirà per stampare le ricorrenza
    private int letteraA; 
    public void ricorrenzaA(){
        //richiamo della classe Input
        Input input_array = new Input();
        //richiamo della funzione input che serve per riempire il nuovo array
        input_array.input();
       array = input_array.getarray(); //riempimento del nuovo array
       
       
       for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] );
        }
       for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {  // Controlla se il carattere è 'a'
                letteraA++;  // Incrementa il contatore
            }
            
        }
       System.out.println("\nla lettera a e uscita " + letteraA + "  volte" );
    }
}
