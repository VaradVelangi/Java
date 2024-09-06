public class Smallest {
    public static void main(String[] args) {
        int a[]={5,2,8,6,4,1};
        int smallest=a[0];
        int largest=a[0];
        int secondlarg=a[0];
        int secondSmall=a[0];
        for (int i = 0; i < a.length; i++) {
            if(smallest>a[i]){
                secondSmall=smallest;
                smallest=a[i];
            }
            if(secondSmall>a[i] && a[i]!=smallest){
                secondSmall=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (largest <a[i]) {
                secondlarg=largest;
                largest = a[i];
            }
            if(secondlarg<a[i] && a[i]!=largest){
                secondlarg=a[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
        System.out.println(secondlarg);
        System.out.println(secondSmall);
    }
}
