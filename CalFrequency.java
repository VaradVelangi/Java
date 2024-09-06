public class CalFrequency {
    public static void main(String[] args) {
        String a="takeuforward";
        char b[]=new char[26];
        for (int i = 0; i < a.length(); i++) {
            b[a.charAt(i)-'a']++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i]!=0){
                System.out.print((char)(i+'a')+":");
                System.out.print(i);
                System.out.println();
            }
        }




    }
}
