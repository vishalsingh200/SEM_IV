// input: n = 5
// output 5 4 3 2 1
public class Recursion4 {
    public static void fun(int n){
        if (n == 0)
            return;
        System.out.println(n);
        fun(n-1);

    }

    public static void main(String[] args) {
        fun(5);
    }
}
