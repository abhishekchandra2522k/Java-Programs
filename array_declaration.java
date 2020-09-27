import java.util.*;

public class array_declaration{
	public static void main(String args[]){
		int[] arr = new int[5];
		arr[0] = 33;
		arr[1] = 54;
		arr[2] = 45;
		arr[3] = 78;
		arr[4] = 98;


		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}