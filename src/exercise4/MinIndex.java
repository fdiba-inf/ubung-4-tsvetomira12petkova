package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int g = input.nextInt();
    double [] elemente = new double[g];

    System.out.println("Geben Sie Zahlen ein: ");

    for(int index = 0; index<elemente.length; index++){
      elemente[index] = input.nextDouble();

    }
    int min = 0;

    double minel = elemente[0] ;

    for(int index = 1; index<elemente.length; index++){
      if (minel > elemente[index]){
        minel = elemente[index];
        min = index;
      }
    }







    System.out.println("Min index: " + min);
  }
}