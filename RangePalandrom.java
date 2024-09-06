public class RangePalandrom {
    public static void main(String[] args) {
        int max=150;
        int min=100;
        for (int i = min; i <max ; i++) {
            if(checkPalan(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean checkPalan(int i){
        int c=i;
        int pal=0;
        while (i>0){
            int rem=i%10;
            pal=pal*10+rem;
            i=i/10;
        }
        if(c==pal){
            return true;
        }
        else return false;
    }
}
