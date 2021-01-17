import java.util.*;

public class wrapperclass_2 {
	public static void main(String args[]){
		Integer a = new Integer(5);

		int i = a.intValue();

		a = 10; 

		int j = a; // Unboxing in wrapper class

		System.out.println(i);
		System.out.println(j);
	}
}