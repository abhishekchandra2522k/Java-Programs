import java.util.*;

public class constructor{
	static int i; // Static variable 
	int j; // Instance Variable
	constructor(){
		i++;
		j++; 
		System.out.println("i="+i);
		System.out.println("j="+j);
	}

	public static void main(String a[]){
		constructor a1 = new constructor();
		constructor a2 = new constructor();
		constructor a3 = new constructor();
		constructor a4 = new constructor();
	}
}