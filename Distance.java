import java.math.*;
public class Distance {
    public static void main(String[] args) {
        int x1=1;
        int x2=1;
        int y1=2;
        int y2=3;
        int diff1=x2-x1;
        int diff2=y2-y1;
        double value=Math.sqrt((Math.pow(diff1,2)))+Math.sqrt((Math.pow(diff2,2)));
        System.out.println(value);
    }

}
