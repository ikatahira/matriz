public class Exemplo4 {
    

    public static void main(String[] args) {
        

        String txt[]=new String[4];
        int t,i,s;
        s=0;
        txt[0]="a";
        txt[1]="a";
        txt[2]="c";
        
             for (i = 0; i < 3; i++) {
            if(txt[i].equals("a"))
                s=s+1;
            
        }
        System.out.println("Quantidade de a no texto"+ s);
        
        
    }
}
