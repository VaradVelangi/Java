public class f {
    public static void main(String[] args) {
        int n=7;
        System.out.println(cal(n));
    }
    public static int cal(int n){
       if(n<=1){
           return n;
       }

       return cal(n-1)^cal(n-2);

    }
}
