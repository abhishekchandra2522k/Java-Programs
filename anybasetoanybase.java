import java.util.*;
  
  public class anybasetoanybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     
     int dec = anybasetodecimal(n,sourceBase);
     int dn = decimaltoanybase(dec, destBase);
     System.out.println(dn);
  }  
      public static int decimaltoanybase(int n, int b){
       int dn = 0;
       for(int i = 1;n > 0;){
       int dig = (n % b);
       n = n / b;
       dn += dig * i;
       
       i = i * 10;
       
       }
       return dn;
      }   
      
      public static int anybasetodecimal(int n, int b){
        int rv = 0;
        int p = 1;
        while(n > 0){
            int dig = (n%10);
            n /= 10;
            rv += dig * p;
            
            
            p = p * b;
        }
        
        return rv;
  }
}