public class Divisible {
    public static void main(String[] args) {
        int min=100;
        int max=160;
        int sum=0;
        for (int i = min; i <= max; i++) {
            if( i%3==0 && i%5==0)sum=sum+i;
        }
        System.out.println(sum);
    }
}
