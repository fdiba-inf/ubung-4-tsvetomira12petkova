package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement{
  public static void main (String []args){
    Scanner input = new Scanner (System.in);
    
    int groesse = input.nextInt();
    double [] zahlen = new double [groesse];

    
    System.out.println("Geben Sie Zahlen ein: ");
    for (int index = 0; index<zahlen.length; index++){
      zahlen[index] = input.nextDouble();
    }
    double max=zahlen[0];

    for(int index = 1; index<zahlen.length; index++){
      
      if (max < zahlen[index]){
        max = zahlen[index];
      }

      
    }


      System.out.println("Max number: " + max);

    }


    

  }
