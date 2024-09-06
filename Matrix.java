import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
       int mat[][] = { { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } };

        for (int i = 0; i < 4; i++) {
            int max=0;
            for (int j = 0; j < 4; j++) {
                if (mat[i][j]>max){
                    max=mat[i][j];
                }
                if (j==3){
                    a.add(max);
                }
            }
        }
        System.out.println(a);
        for (Integer integer : a) {
            System.out.println(integer);
        }

    }
}
