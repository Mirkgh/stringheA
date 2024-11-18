
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
  
    public void ricorrenzaA(){
        //richiamo della classe Input
        Input input_array = new Input();
        //richiamo della funzione input che serve per riempire il nuovo array
        input_array.input();
       array = input_array.getarray(); //riempimento del nuovo array
       
       //stampa dell'array
       System.out.print("la parola inserita e "  );
       for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] );
        }
       for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {  // Controlla se il carattere è 'a'
                
                System.out.println("\nA");
            }
            
        }
       
      
    }
}
