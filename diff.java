public class diff {
    public static void main(String[] args) {
        int a[]={12,3,14,56,77,13};
        int num=13;
        int diff=2;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]-num==diff || a[i]-num<diff)count++;
        }
        System.out.println(count);


    }
}
