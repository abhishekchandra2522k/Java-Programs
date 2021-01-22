import java.util.*;

public class classes_objects{
	public static void main(String args[]){
		faculty f1 = new faculty();

		f1.fac_id = 101;
		f1.fac_name = "Abhishek";
		f1.display();
	}
}


class faculty{
	int fac_id;
	String fac_name;
	void display(){
		System.out.println(fac_id);
		System.out.println(fac_name);
	}
}