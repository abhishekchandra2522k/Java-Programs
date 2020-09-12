import java.util.*;

public class pattern7_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1;i<=n;i++){
             for(int j = 1; j<=n;j++){
                if(i == j){
                System.out.print("*");
                }else{
                System.out.print("\t");
            	}
            }
            System.out.println();
        }

    }
}


/*

input = 5;

output : 

*
	*
		*
			*
				*
*/
