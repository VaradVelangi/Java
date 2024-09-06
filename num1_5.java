class print{
    void display(int n){
        if(n==6) return;
        System.out.println(n);
        display(n+1);
    }
}


public class num1_5 {
    public static void main(String[] args) {
        print p1=new print();
        p1.display(1);
    }
}
