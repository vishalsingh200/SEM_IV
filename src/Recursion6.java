import java.util.Scanner;

//Input:  n  = 99999
//        Output: 5
//        Explanation:Number of digit in 99999 is 5


public class Recursion6 {
    int count = 0;
     int digit(int n) {
        if (n != 0) {
            count++;
            digit(n / 10);
        }
        return count;
    }

    public static void main(String[] args) {
        Recursion6 obj = new Recursion6();
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(obj.digit(num));

    }
}
