import java.util.*;

public class gcd_lcm{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int num1 = scn.nextInt();
	int num2 = scn.nextInt();
	
	int or1 = num1;
	int or2 = num2;
	
	while(num1 % num2 != 0){
	int rem = num1 % num2;
	num1 = num2;
	num2 = rem;
	}
	System.out.println(num2);
	
	int gcd = num2;
	
	int lcm = (or1 * or2) / gcd;
	System.out.println(lcm);
}
}
