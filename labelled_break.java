import java.util.*;

public class labelled_break {
	public static void main(String args[]){

		outer:for(int i = 0; i<5; i++){
		
			inner:for(int j= 0; j<5;j++){
				System.out.println(j);
				if(i==1)
					break outer;    // labelled break statement that breaks the outer loop
			}
		}
	}	
}