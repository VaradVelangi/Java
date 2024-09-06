import java.util.Scanner;
public class LL {
   public static void merge(int a[],int si,int mid,int ei){
       int[] merged=new int[si+ei];
       int x=si;
       int y=mid;
       while (x<=mid && y<=ei){

       }
   }
    public static void divide(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(si-ei)/2;
        divide(a,0,mid);
        divide(a,mid+1,ei);
        merge(a,si,mid,ei);

    }
    public static void main(String[] args) {
        int[] a={1,5,2,8,4,9};
        int n=a.length;
        divide(a,0,n);
    }
}