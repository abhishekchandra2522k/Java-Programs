import java.util.*;

public class intstringin{
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	int n = Integer.parseInt(scn.nextLine());
	String name = scn.nextLine();
	System.out.println("Hi, " + name + ", Here is your counting.");
	for(int i = 0; i <= n; i++)
		System.out.println(i);

}

}