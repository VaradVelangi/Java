public class Divisible11 {
    public static void main(String[] args) {
        int n=1215598;
        int rem=0;
        int digit=0;
        while (n>0){
            rem=n%10;
            digit=digit*10+rem;
            if (digit/11==0){
                System.out.println(digit);
            }
            n=n/10;
        }
    }
}
