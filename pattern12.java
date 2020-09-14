import java.util.*;

public class pattern12 {
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	 int first = 0;
	    int sec = 1;
	    int sum = 0;

	for(int i = 1;i<=n;i++){
	for(int j = 1;j<=i;j++){
	System.out.print(first + "\t");
	    sum = first + sec;
	    first = sec;
	    sec = sum;
	}
	System.out.println();
	}
}
}

/*

input = 5;

output:

0
1	1
2	3	5
8	13	21	34
55	89	144	233	377

*/
