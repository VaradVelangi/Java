public class Rat {
    public static void main(String[] args) {
        int r=7;
        int unit=2;
        int n=8;
        int a[]={2,8,3,5,7,4,1,2};
        int sum=0;
        int food=r*unit;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
            if(sum>=food){
                System.out.println(i+1);
                break;
            }
        }





    }
}
