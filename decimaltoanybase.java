import java.util.*;
  
  public class decimaltoanybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
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
