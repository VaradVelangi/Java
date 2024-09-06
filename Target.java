public class Target {
    public static void main(String[] args) {
        int a[]={2,3,4,10,40};
        int target=90;
        for (int i = 0; i < a.length; i++) {
            if (target==a[i]){
                System.out.println("Element Found ");
                break;
            }
            if (i==a.length-1) System.out.println("Element not found");
        }
    }
}
