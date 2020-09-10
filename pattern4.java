import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int sp = 0;
        int str = n;
        for(int i = 1; i <= n; i++){
            for(int m = 1; m<=sp; m++){
                System.out.print("\t");
            }
            for(int j = 1; j <=str ;j++){
                System.out.print("*\t");
            }
            str--;
            sp++;
            System.out.println();
            
        }

    }
}


/*

input = 5;
output : 

*	*	*	*	*
	*	*	*	*
		*	*	*
			*	*
				*
*/
