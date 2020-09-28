import java.util.*;


public class two_arrays{
	public static void main(String args[]){
		int[] one = new int[5];
		one[0] = 16;
		one[1] = 15;
		one[2] = 14;
		one[3] = 13;
		one[4] = 12;

		int[] two = one;
		two[0] = 17;

		for(int i = 0; i<one.length;i++){
			System.out.println(one[i]);
		}

		for(int i = 0; i<two.length;i++){
			System.out.println(two[i]);
		}
	}
}