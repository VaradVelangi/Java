import java.util.*;
public class Return {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        result(a);

    }
    public static int result(int a[]){
        int sum=0;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            count++;
        }
        return 0;

    }
}
