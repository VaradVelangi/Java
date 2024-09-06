public class StringA {
    public static void main(String[] args) {
        String a="Varad Anand Velangi";
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }

            }
            if (count>2) System.out.println(i);
        }
    }
}
