public class RemoveVowel {
    public static void main(String[] args) {
        String a="take u forward";
        String b=" ";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='a' ||a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u'){
                a=a.substring(0,i)+a.substring(i+1);
            }

        }
        System.out.println(a);
    }
}
