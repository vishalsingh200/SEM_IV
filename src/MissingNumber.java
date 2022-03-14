//Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
//        Output: 5
//        Explanation: The missing number from 1 to 8 is 5
//
import java.util.Scanner;
public class MissingNumber {
    public static int missing(int arr[]){
        int n= arr.length;
        int sum = (n+1)*(n+2)/2;
        for(int i = 0; i<n; i++){
            sum = sum - arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
       int arr[] = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(missing(arr));
    }

}
