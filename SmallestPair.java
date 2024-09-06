public class SmallestPair {
    public static void main(String[] args) {
        int a[]={5,2,4,3,9,7,1};
        int sum=9;
        int num= a.length;
        int first,second;
        int product=1;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if((a[i]+a[j+1]<=sum) ){
                    product=1;
                    if (a[i]+a[j+1]<num)product=i*j;
                }
            }
        }
        System.out.println(product);


    }
}
