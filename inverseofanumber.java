import java.util.*;

public class inverseofanumber{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
	int inv = 0;
	int op = 1; // Original Place
	while(n != 0){
	int  od = n % 10;  // Original Digit
	int id = op;       // Inverted Digit
	int ip = od;	   // Inverted Place
	inv = inv + id * (int)Math.pow(10, ip - 1);
	n = n / 10;
	op++;
	}
	System.out.println(inv);
}
}
