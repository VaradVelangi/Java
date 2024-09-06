public class palan {
    public static void main(String[] args) {
        String a="ABCuDCBA";
        int left=0;
        int right=a.length();
        while (left<right){
            if (a.charAt(left)!=a.charAt(a.length()-left-1)){
                System.out.println("Not a Palandrome");
                return;
            }
            left++;
            right--;
        } System.out.println("Palandrome");
    }
}
