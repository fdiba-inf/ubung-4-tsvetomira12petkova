package exercise4;

import java.util.Arrays;
import java.util.Scanner;

  public class ArrayReversal{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int groesse = input.nextInt();
      char [] symbols = new char [groesse];

      System.out.println("Geben Sie Buchstaben ein: ");

      for (int index = 0; index<symbols.length; index ++){
        symbols[index] = input.next().charAt(0);

      }
      char [] elements = new char [groesse];
      for(int i = 0; i<elements.length; i++){
        elements[i] = symbols[symbols.length - 1 - i] ;
        

      }


      String elementsAsString = Arrays.toString(elements);
      System.out.println("Reversed symbols: " + elementsAsString);
     }
  }