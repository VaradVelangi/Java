public class Reverse {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int left=0;
        int right=a.length-1;
        while (left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
