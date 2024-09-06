public class LastWordLength {
    public static void main(String[] args) {
        String a="Hello World";
        int count=0;
        int left=a.length()-1;
        while(a.charAt(left)!=' '){
            count++;
            left--;
        }
        System.out.println(count);
    }
}
