package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput{
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Geben Sie Groesse ein: ");
    int b = input.nextInt();
    System.out.println ("Geben Sie Zahlen ein: ");
    int [] zahlen = new int[b];
    int count = 0;

    for(int index = 0; index<zahlen.length; index++){
      zahlen[index] = input.nextInt();
      
    }
     count ++;
    System.out.println ()
    
  }
  

}