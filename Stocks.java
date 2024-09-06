public class Stocks {
    public static void main(String[] args) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int a[]={7,1,5,3,6,4};
        for (int i = 0; i <a.length ; i++) {
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]-min);
        }
        System.out.println(max);
    }
}
