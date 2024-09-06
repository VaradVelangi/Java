public class DivisibleBy11 {
    public static void main(String[] args) {
        int a=1215598;
        int count=0;
        int sum=0;
        while (a>0){
            int rem=a%10;
            sum=sum*10+rem;
            if (sum%11==0)count++;
            a=a/10;
        }
        System.out.println(count);
    }
}
