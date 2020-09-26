import java.util.*;
  
  public class anybasemultiplication{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getProduct(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getProduct(int b, int n1, int n2){
    int dec1 = anybasetodecimal(n1,b);
    int dec2 = anybasetodecimal(n2,b);
    
    int sum = dec2 * dec1;
    int rsum = decimaltoanybase(sum,b);
    return rsum;
    
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
          
      
  }