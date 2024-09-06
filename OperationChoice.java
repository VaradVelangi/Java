public class OperationChoice {
    public static void main(String[] args) {
        int a=16,b=20,c;
        c=2;
        switch (c){
            case(1):
                System.out.println(a+b);
                break;
            case (2):
                System.out.println(a-b);
                break;
            case (3):
                System.out.println(a*b);
                break;
            case (4):
                System.out.println(a/b);

            default:
                System.out.println("Enter Correct value of c");
        }

    }
}
