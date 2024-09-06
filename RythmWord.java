public class RythmWord {
    public static void main(String[] args) {
        String words[]={"gender","blender","blunder","under"};
        String target="thunder";
        int msc=0;
        String best=" ";
        for (int i = 0; i < words.length; i++) {
            int lsc=checklenght(words[i],target);
            if (lsc>msc || lsc==msc && words[i].length()<best.length()){
                best=words[i];
                msc=lsc;
            }
        }
        System.out.println(best);

    }
    public  static int checklenght(String a,String c){
        int count=0;
        int first=a.length()-1;
        int second=c.length()-1;
        while (first>=0 && second>=0){
            if (a.charAt(first)==c.charAt(second)){
                count++;
                first--;
                second--;
            }
            else break;
        }



        return count;
    }
}
