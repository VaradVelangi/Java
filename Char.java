public class Char {
    public static void main(String[] args) {
        String a="Tak6e u Forward8 is Aweso0me";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))){
                System.out.println(a.charAt(i));
            }
        }

    }
}
