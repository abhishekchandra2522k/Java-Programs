import java.util.*;

public class pattern15{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	
	int sp = n / 2;
	int st = 1;
	int val = 1;
	for(int i = 1; i<=n;i++){
		for(int j = 1;j<=sp;j++){
			System.out.print("\t");
		}
		int cval = val;
		for(int j = 1;j<=st;j++){
			System.out.print(cval + "\t");
			if(j <= st/2){
			    cval++;
			}
			else{
			    cval--;
			}
			
		}
		if(i <= n / 2){
			st+=2;
			sp--;
			val++;
		}else{
			st-=2;
			sp++;
			val--;
		}
		System.out.println();
	}
}
}

/*
input = 5;
output:

		1
	2	3	2
3	4	5	4	3
	2	3	3
		1
*/
