import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    System.out.println("Criando uma pilha!");
    Scanner scan = new Scanner(System.in);
    System.out.print("Defina um valor total para a pilha: ");
    Stack pilha = new Stack(scan.nextInt());
    System.out.println("Ei garotinho vamos encher os valores dentro do array?");
    do {
      System.out.print("indique um numero: ");
      pilha.push(scan.nextInt());
    } while (!pilha.isFull());
    pilha.getStackValues();
    scan.close();
  }
}
