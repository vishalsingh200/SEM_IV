public class Recursion {
    public static void recursion(int num){
        if(num < 1)
            return;
        else
            System.out.println(num + "");
            recursion(num-1);
            return;
    }

    public static void main(String[] args) {
        int num = 5;
        recursion(num);
    }
}
