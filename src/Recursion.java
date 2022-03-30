public class Recursion {
   static void print(int n){
       if (n == 0)
           return;
       System.out.println("Recuriion");
       print(n-1);
   }

    public static void main(String[] args) {
       print(3);
    }
}
