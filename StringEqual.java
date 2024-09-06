public class StringEqual {
    public static void main(String[] args) {
        String a[]={"ab","c"};
        String b[]={"a","bc"};
        String c=" ";
        String d=" ";
        for (int i = 0; i < a.length; i++) {
           c=c.concat(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            d=d.concat(b[i]);
        }
        if (c.contentEquals(d)) System.out.println("Both strings are equal");
        else System.out.println("Not equal");

    }
}
