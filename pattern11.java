import java.util.*;

public class pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int x =1;
        for(int i = 1;i<=n;i++){
         for(int j = 1;j<=i;j++){
             System.out.print(x + "\t");
             x++;
         }   
         System.out.println();
        }
        

    }
}

/*

input = 4;

output :

1
2	3
4	5	6
7	8	9	10

*/
