public class StripSpacw {
    public static void main(String[] args) {
        String a="How are you doing";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==' ')continue;
            else System.out.print(a.charAt(i));
        }
    }
}
