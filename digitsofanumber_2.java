import java.util.*;
    
    public class digitsofanumber_2{
    
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
      int div = (int)Math.pow(10,count-1);
      while(div != 0){
         disp = k / div;
         k = k % div;
         System.out.println(disp);
         div = div /10; 
      }
     }
    }
