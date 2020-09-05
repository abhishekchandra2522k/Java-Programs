import java.util.*;

public class fibonaccitilln{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	int first  = 0;
	int sec = 1;
	System.out.println(first + "\n" + sec);
	for(int i = 0; i < n-2; i++){
		int sum = first + sec;
		System.out.println(sum);
		first = sec;
		sec = sum;
	}
}
}
