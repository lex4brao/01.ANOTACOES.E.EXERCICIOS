package Aula19;

public class Ex104 {
  public static void main (String[] args) {
    
    int i=0, j=0;
    int[] vetor = new int[10];
    System.out.println("Análisando os elementos to vetor");
    for(i=0;i<vetor.length;i++) {
      vetor[i] = (int) (Math.random()*10);
      System.out.println("A análisando o numero "+vetor[i]);
      for(j=2;j<=vetor[i];j++) {
        if (j%2==0){
          System.out.println(j+" é par");
        } 
      } 
    }  
  }
}