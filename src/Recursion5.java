// input: n = 5
// output: 1 2 3 4 5
public class Recursion5 {
    public static void fun(int n){
        if (n==0)
            return;
        fun(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(5);

    }
}
