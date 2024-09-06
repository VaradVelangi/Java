public class CountWords {
    public static void main(String[] args) {
        String a="Hi My name is Varad";
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
