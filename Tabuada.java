import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        
        int idades[]=new int[11];
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a tabuada:");
        int tabuada=sc.nextInt();
        for (int i = 0; i < idades.length; i++) {
            idades[i]=i*tabuada;
            
        }
        for (int i:idades) {
            System.out.println(i);
        }
    }   
}
