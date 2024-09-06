public class Birthday {
    public static void main(String[] args) {
        float n=5;
        float sum=1;
        while (n>0){
            if (n == 1) {
                sum=sum+2;
                break;
            }
            sum=sum+n;
            n=n-1;
        }
        System.out.println(sum%1000000007);
    }
}
