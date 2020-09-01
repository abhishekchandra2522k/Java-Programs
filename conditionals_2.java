import java.util.*;

public class conditionals_2{
public static void main(String args[]){
	int n1 = 10,n2 = 10;
	
	if(n1 == n2){
		System.out.println(n1 + " is equal to " + n2);
	}
	else{
		if(n1 > n2){
			System.out.println(n1 + " is greater than " + n2);
		}
		else{
			System.out.println(n1 + " is smaller than " + n2);
		}
	}
}
}
