public class pala {
    public static void main(String[] args) {
        String a="nayan";
        int i=0;
        int j=a.length()-1;
        for (int k = 0; k < a.length(); k++) {
            if(a.charAt(i)!=a.charAt(j)){
                System.out.println("Not a palandrome");
                break;
            }
            if (k==a.length()-1) System.out.println("String is a palandrome");
        }
    }
}
