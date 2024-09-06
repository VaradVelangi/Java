import java.util.*;
public class Hash {
    public static void main(String[] args) {

    HashSet<Integer> a=new HashSet<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(3);
    if(a.contains(2)){
        System.out.println("Key present");
    }
    a.remove(1);
    System.out.println(a.size());
    System.out.println(a);

    Iterator b=a.iterator();

    while (b.hasNext()){
        System.out.println(b.next());
    }



    }

}
