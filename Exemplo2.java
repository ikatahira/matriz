public class Exemplo2 {
    public static void main(String[] args) {
        int a[]={12, 6, 20, 14, 25, 30, 1 };
        int t,i,j,x;
        int v[]=new int[7];

        for (j= 0; j<=6; j++) {
            x=a[j];
        for (i = j-1; (i >= 0 && v[i]>x);i=i-1) {
            v[i+1]=v[i];
            
        }
        v[i+1]=x;
            
        }
   for (j = 0; j<=6; j++) {
       System.out.print(v[j]+ " ");
   }     
    }
   
    
}
