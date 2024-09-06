public class RemoveSpaces {
    public static void main(String[] args) {
        String a = "Take you forward";
        char b[]=new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' '){
                continue;
            }
            else {
                int count=0;
                b[count]=a.charAt(i);
                count++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
