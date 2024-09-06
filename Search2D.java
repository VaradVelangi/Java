public class Search2D {
    public static void main(String[] args) {
        int ar[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if(ar[i][j]==target){
                    System.out.println(true);
                    return;
                }
            }
            if (i==ar.length-1) System.out.println(false);
        }
    }
}
