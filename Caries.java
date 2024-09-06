public class Caries {
    public static void main(String[] args) {
        int a[]={4,5,1};
        int b[]={3,4,9};
        int sum=0;
        int count=0;
        int i=0,j=0;
        while (i<a.length && j<b.length ) {
            if ((sum = a[i] + b[j]) / 10 > 0  ) {
                count++;
            }
            i++;
            j++;
        }
        System.out.println(count);


    }
}
