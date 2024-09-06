public class RegExp {
    public static void main(String[] args) {
        String a="a+b+c";
        String b="aaabbc";
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i)!='a' || b.charAt(i)!='b' || b.charAt(i)!='c'){
                System.out.println("Not Matched");
            }
            if (i==b.length()){
                System.out.println("Matched");
            }


        }






    }
}
