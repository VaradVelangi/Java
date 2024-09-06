public class ReverseWords {
    public static void main(String[] args) {
        String a="this is an amazing program";
        String b[]=a.split(" ");
        for (int i = b.length-1; i >=0; i--) {
            System.out.print(b[i]+" ");
        }
    }
}
