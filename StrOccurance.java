public class StrOccurance {
    public static void main(String[] args) {
        String a="apple";
        int b[]=new int[256];
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            b[a.charAt(i)-'a']++;
        }
        char max='a';
        for (int i = 0; i < b.length; i++) {
            if (b[i]>max){
                max=(char)(i+'a');
            }
        }
        System.out.println(max);



    }
}
