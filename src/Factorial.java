public class Factorial {
    public static int fact (int num){
        if (num==0 || num==1)
            return 1;
        else
            return fact(num-1)*num;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(fact(num));
    }
}
