public class Recursion8 {
    public static int fabi(int n){
        if( n<=1)
            return n;
        return fabi(n-1)+fabi(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fabi(4));
    }
}
