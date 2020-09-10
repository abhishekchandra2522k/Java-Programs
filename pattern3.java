import java.util.*;

public class pattern3{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	
	int sp = n-1;
	
	for(int i=1; i<=n;i++){
		//System.out.print(sp + ", " + str);
		for(int j =1; j<=sp; j++){
		System.out.print("\t");
		}
		for(int m = 1; m<=i;m++){
		System.out.print("*\t");
		}
		
		sp--;
		System.out.println();
	}

}
}


/*
input = 5;

output : 

				*
			*	*
		*	*	*
	*	*	*	*
*	*	*	*	*

*/
