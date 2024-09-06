public class ReverseWord {
    public static void main(String[] args) {
        String a = "hello Word";
        String[] b = a.split(" ");

        for (int i = b.length-1; i >=0; i--) {
            System.out.print(b[i]+" ");
        }


    }
}
