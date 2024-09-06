public class CountDigit {
    public static void main(String[] args) {
        int a[]={5,2,4,1,2};
        int target=2;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target)count++;
        }
        System.out.println(count);
    }
}
