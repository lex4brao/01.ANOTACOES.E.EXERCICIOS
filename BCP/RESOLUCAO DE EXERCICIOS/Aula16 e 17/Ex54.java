package Aula17;

import java.util.Scanner;

class Ex54 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, valor1=0, valor2=0, valor3=0;
    System.out.println("Sequencia Fibonacci");
    valor1 = 0;
    valor2 = 1;
    System.out.print(valor1+" - "+valor2);
    do {
      valor3 = valor1+valor2;
      valor1 = valor2;
      valor2 = valor3;
      System.out.print(" - "+valor3);
    } while(valor3<=500);

  }
}
 