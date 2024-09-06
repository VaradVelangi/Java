public class ChangeAlpha {
    public static void main(String[] args) {
        String a="apples";
        char n1='a';
        char n2='p';
        String b=new String();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='a'){
                b=b+'p';
            } else if (a.charAt(i)=='p') {
                b=b+'a';
            }else b=b+a.charAt(i);

        }
        System.out.println(b);

    }
}
