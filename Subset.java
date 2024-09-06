public class Subset {
    public static void main(String[] args) {
        int a[]={1,3,4,5,2};
        int b[]={4,5,2};
        boolean check=false;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if(a[i]==a[j]){
                    check=true;
                    break;
                }else check=false;
            }

        }
        if (check){
            System.out.println("Array 1 is subset of 2");
        }
        else System.out.println("Not a Subset");
    }
}
