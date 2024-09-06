public class FiboRecuu {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(cal(i));
        }
    }
    public static int cal(int n){
        if (n<=1){
            return n;
        }
        return cal(n-1)+cal(n-2);
    }
}
