public class MoveHypo {
    public static void main(String[] args) {
        String a="Move-Hyphens-to-Front";
        String b="";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='-'){
                b=a.charAt(i)+b;
            }
            else b=b+a.charAt(i);
        }
        System.out.println(b);
    }
}
