public class natural {
    public static void print(int n,int sum){
        if (n==0) {
            System.out.println(sum);
        }
        sum+=n;
        print(n-1,sum);
    }

    public static void main(String[] args) {
        int sum=0;
        print(10,sum);

    }
}
