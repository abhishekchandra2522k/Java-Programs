import java.util.*;

public class digitfrequency{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int temp = n;
        int count = 0;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        int count_2 = 0;
        for(int i = 1;i<=count;i++){
            int new_n = n % 10;
            n /= 10;
            if(new_n == d){
                count_2++;
            }
        }
        return count_2;
    }
}
