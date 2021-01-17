import java.util.*;

public class wrapperclass_1{
	public static void main(String args[]){
		int i = 0;

		Integer j = Integer.valueOf(i);
		
		i = 10;

		Integer ab = i;  // AutoBoxing in wrapper class

		System.out.println(j);

		System.out.println(ab);
	}

}

/*

Primitive  Wrapper

int      : Integer
float 	 : Float
char   	 : Character
double 	 : Double
byte     : Byte
short    : Short
long     : Long
boolean  : Boolean
*/