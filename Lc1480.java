import java.util.Arrays;
import java.util.Scanner;

class Lc1480 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int[] ans=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
            ans[i]=sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
