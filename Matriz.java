import java.util.Scanner;
public class Matriz{
 public static void main(String[] args) {
     
    int [] idades;
    idades=new int[5];
    Scanner sc=new Scanner(System.in);
    for (int index = 0; index < idades.length; index++) {
        System.out.println("Digite o "+(index+1) + "número");
        idades[index]=sc.nextInt();
       
       System.out.println("Eu tenho "+idades[index]+" anos");  
    }
       
  }

}