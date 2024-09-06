import java.util.*;
public class LCM {
    public static void main(String[] args) {
        int a=3;
        int b=7;
        int gcd=0;
        for (int i = Math.min(a,b); i >0; i--) {
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        int lcm=a*b/gcd;
        System.out.println(lcm);
    }
}
