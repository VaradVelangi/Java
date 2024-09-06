public class anangram {
    public static void main(String[] args) {
        String a="anagram";
        String b="nagaram";
        int arr[]=new int[26];

        if(a.length()!=b.length()){
            System.out.println("Not a anangram");

        }else {
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']--;
        }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0) System.out.println("Not an anangram");
                if((i==arr.length-1)) System.out.println("An anangram");
            }
        }

    }
}
