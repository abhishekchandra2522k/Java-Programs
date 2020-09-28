import java.util.*;


public class swap_array_element{

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]){
		int[] one = new int[5];
		one[0] = 16;
		one[1] = 15;
		one[2] = 14;
		one[3] = 13;
		one[4] = 12;

		swap(one, 4, 0);

		for(int i = 0; i<one.length;i++){
			System.out.println(one[i]);
		}

	}
}