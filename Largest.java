public class Largest {
    public static void main(String[] args) {
        int a[]={2,3,8,4,10,456};
        int largest=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>largest)largest=a[i];
        }
        System.out.println(largest);
    }
}
