public class planadrome {
    public static void main(String[] args) {
        int n=4554;
        int x=n;
        int rem,palandrome=0;
        while (n>0){
            rem=n%10;
            palandrome= palandrome*10 +rem;
            n=n/10;
        }
        if (x==palandrome){
            System.out.println("Palandrome Number");
        }
        else System.out.println("Not a palandrome");
    }
}
