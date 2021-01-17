import java.util.*;

public class labelled_continue {
	
	public static void main(String a[]){

		outer: for(int i = 0; i<3 ;i++){
		
			for(int j = 0; j<3 ;j++){
		
				System.out.println(i + j);
				
				if(i == j){
					continue outer;
				}
			}
		}
	}
}