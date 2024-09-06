public class Bracket {
    public static void main(String[] args) {
        String a="a+((b-c)+d)";
        int j=0;
        char[] c=new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='(' || a.charAt(i)==')')continue;
            else {
                c[j]=a.charAt(i);
                j++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i]==0)continue;
            else System.out.print(c[i]);
        }

    }
}
