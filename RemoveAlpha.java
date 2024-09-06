public class RemoveAlpha {
    public static void main(String[] args) {
        String a="take12% *&u ^$#forward";
        char b[]=a.toCharArray();
        int j=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>'A' && a.charAt(i)<'Z' || a.charAt(i)>'a' && a.charAt(i)<'z' || a.charAt(i)==' ' ) {
                    b[j]=a.charAt(i);
                    j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(b[i]);
        }
        }
    }

