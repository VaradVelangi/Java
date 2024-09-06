public class MaxValueAndIndex {
    public static void main(String[] args) {
        int arr[]={23,45,82,27,66,12,78,13,71,86};
        int larger=arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>larger){
                larger=arr[i];
                index=i;
            }
        }
        System.out.println(larger);
        System.out.println(index);
    }
}
