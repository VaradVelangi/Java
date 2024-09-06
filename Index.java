public class Index {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int key=311;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key){
                System.out.println(i);
                break;
            }
            if (i==a.length-1){
                System.out.println("Not found");
            }
        }
    }
}
