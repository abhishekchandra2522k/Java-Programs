import java.util.*;
    
    public class digitsofanumber{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt();
      int disp = n;
      int count = 0;
      int k = n;
      while(n != 0){
           n = n / 10;
           count++;
      }
      while(k != 0){
         disp = k / (int)Math.pow(10,count-1);
         k = k % (int)Math.pow(10,count-1);
         System.out.println(disp);
         count--; 
      }
     }
    }
