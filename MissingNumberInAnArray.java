public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int a[]={1, 2, 4, 6, 3, 7, 8};
        int n=8;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        int actual=(n*(n+1))/2;
        System.out.println(actual-sum);
    }
}
