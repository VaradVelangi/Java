public class SuperElement {
    public static void main(String[] args) {
        int a[]={2,8,9,7,4,2};
        int num=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]<a[j]){
                    break;
                }
                if (j== a.length)num++;

            }

        }
        System.out.println(num+1);
    }
}
