import java.util.*;

public class isanumberprime_2{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
	
	for(int i = 0; i < t; i ++){
		int count = 0;
		int n = scn.nextInt();
		for(int div = 2; div * div <= n; div ++){
			if( n % div == 0){
				count++;
				break;
					  }
					 }
			if(count == 0){
				System.out.println("prime");
				      }
			else{
				System.out.println("not prime");
		            }
	}
	
}
}
