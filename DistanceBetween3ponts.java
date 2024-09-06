public class DistanceBetween3ponts {
    public static void main(String[] args) {
        int x1=1,y1=1;
        int x2=2,y2=4;
        int x3=3,y3=6;
        double distance=0;
        double sum1=Math.sqrt(x2-x1);
        double sum2=Math.sqrt(y2-y1);
        distance=Math.pow(sum1,2)+Math.pow(sum2,2);
        System.out.println(distance);
    }
}
