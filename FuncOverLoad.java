import java.util.*;
class student{
    String name;
    int age;

    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    }
    public void info(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class FuncOverLoad {
    public static void main(String[] args) {
        student s1=new student();
        s1.info("Varad");
        s1.info(22);
        s1.info("Varad",22);
    }


}
