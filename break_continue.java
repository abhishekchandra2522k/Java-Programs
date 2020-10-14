package For_loop;

import java.util.Scanner;

public class break_continue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        boolean divided = false;
        
        for( int d = 2; d < n; d++) {
        	if(n%d == 0) {
        		divided = true;
        		break;
        	}
        }
        
        if (divided) {
        	System.out.println("Not Prime");
        } else {
        	System.out.println("Prime");
        }

        s.close();
	}

}
