import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[]={2,3,1,9,3,1,3,9};
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])){
                System.out.println(a[i]);
                map.put(a[i],1);
            }
        }



    }
}
