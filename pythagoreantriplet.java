import java.util.*;
  
  public class pythagoreantriplet{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int n3 = scn.nextInt();
    
    if(n1*n1 == n2*n2 + n3*n3 || n2*n2 == n1*n1 + n3*n3 || n3*n3 == n2*n2 + n1*n1){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
   }
  }
