import java.util.*;


public class find_element_in_an_array{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for(int i = 0; i<n;i++){
			arr[i] = scn.nextInt();
		}

		int d = scn.nextInt();

		
		int flag = -1;
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == d){
				flag = i;
			}
		}
		System.out.println(flag);

	}
}