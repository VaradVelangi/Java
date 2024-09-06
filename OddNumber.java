public class OddNumber {
    public static void main(String[] args) {
        int n[]={ 2 ,4 ,9 ,7 ,11 ,13 ,25 ,31 ,6 ,8 ,10,24};
        int sum=0;
        for (int i = 0; i < n.length; i++) {
            if((n[i]%2)!=0){
                sum=sum+n[i];
            }
        }
        System.out.println(sum);
    }
}
