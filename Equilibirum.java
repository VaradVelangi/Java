public class Equilibirum {
    public static void main(String[] args) {
        int a[]={1,-1,4};
        int totalsum=0;
        for (int i = 0; i < a.length; i++) {
            totalsum+=a[i];
        }
        int leftsum=0;
        int rightsum=totalsum;

        for (int i = 0; i < a.length; i++) {
            rightsum-=a[i];
            if (leftsum==rightsum){
                System.out.println(i);
            }
            else {
                leftsum+=a[i];
            }
        }




    }
}
