import java.util.*;

public class Count {
    public static void main(String[] args) {
        int a[]={10,5,10,15,10,5};
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
