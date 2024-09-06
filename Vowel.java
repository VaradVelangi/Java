public class Vowel {
    public static void main(String[] args) {
        String a="Varad";
        int vowel=0,consonent=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ) vowel++;
            else consonent++;
        }
        System.out.println(vowel);
        System.out.println(consonent);
    }
}
