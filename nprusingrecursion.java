import java.util.*;

public class nprusingrecursion{
public static int fact(int x){
if(x == 1 || x == 0){
return 1;
}else{
return x*fact(x-1);
}
}
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	int r = scn.nextInt();
	
	int nfact = fact(n);
	
	int nmrfact = fact(n-r);
	
	int npr = nfact / nmrfact;
	
	System.out.println(npr);
}
}
