import java.util.*;

public class vardemo{
	
	int i;  // Initialization not required
	static String name = "CodeKaro"; 
	
	public static void main(String args[]){
		vardemo a1 = new vardemo();
		vardemo a2 = new vardemo();
		a1.i = 10;
		a2.i = 20;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(name);
	}
}