import java.util.*;
import java.io.*;

public class shell_rotate {
	public static void main(String args[]) throws Exception{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] arr = new int[n][m];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}


		int s = scn.nextInt(); // shell_rotate

		int r = scn.nextInt(); // rotation_frequency

		rotateShell(arr, s, r);

		display(arr);
	}

	public static void rotateShell(int[][] arr, int s, int r){
		int oned = fillOnedFromShell(arr, s);
		rotate(oned, r);
		fillShellFromOned(arr, oned, s);

	}

	public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}