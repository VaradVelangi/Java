public class StrReplace {
    public static void main(String[] args) {
        String a="abaabbcc";
        char[] b=a.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if (b[i]=='a'){
                b[i]='b';
                continue;
            }
            if (b[i]=='b'){
                b[i]='a';
                continue;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
