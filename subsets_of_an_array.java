import java.io.*;
import java.util.*;

public class subsets_of_an_array{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int[] arr = new int[n];

    for(int i = 0;i<arr.length;i++){
    	arr[i] = scn.nextInt();
    }

    int limit = (int)Math.pow(2, arr.length);

    for(int i = 0; i < limit ; i++){
    	String set = "";
    	int temp = i;
    		// convert i to binary and use 0's and 1's to determine whether to print the number or not.
    		for(int j = arr.length - 1; j >= 0; j--){
    			int r = temp % 2;
    			temp = temp / 2;
    			if(r == 0){
    				set = "-\t" + set;
    			}else{
    				set = arr[j] + "\t" + set;
    			}
    		}
    		System.out.println(set);
    	}
 	}

}

/*

Input : 3 10 20 30
Output :
 
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30
*/
