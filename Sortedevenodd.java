public class Sortedevenodd {
    public static void main(String[] args) {
        int arr[]={3,4,1,7,9};
        int n=arr.length;
        int i, j, temp;

        for (i = 0; i < n - 1; i++) {

            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {


                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        int even[]=new int[n/2];int count=0;
        int odd[]=new int[n/2];int countodd=0;
        for (int k = 0; k < n; k++) {
            if(i%2==0){
                even[count]=i;
                count++;
            }
            else {
                odd[countodd]=i;
                countodd++;
            }
        }
        for (int k = 0; k < even.length; k++) {
            System.out.print(even[k]);
        }
        for (int k = 0; k < odd.length; k++) {
            System.out.print(odd[k]);
        }
    }
}
