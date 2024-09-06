public class rootdiff {
    public static void main(String[] args) {
        double min=1;
        double max=10;
        double sumeven=0;
        double sumodd=0;
        for (double i = min; i <=max ; i++) {
            if(i%2==0){
                sumeven=sumeven+(Math.sqrt(i));
            }else {
                sumodd=sumodd+(Math.sqrt(i));
            }
        }
        System.out.println(sumeven-sumodd);
    }
}
