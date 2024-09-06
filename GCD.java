import java.util.*;
public class GCD {
    public static void main(String[] args) {
        int a=20;
        int b=15;
        for (int i = Math.min(a,b); i >0; i--) {
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }

    }
}
