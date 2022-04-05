
public class Recursion7 {
    public static int  fabi(int n) {
        if (n==0)
            return 1;
        return n*fabi(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fabi(4));
    }
}

