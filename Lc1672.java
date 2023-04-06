import java.util.ArrayList;
import java.util.Scanner;

class Lc1672 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[sc.nextInt()][sc.nextInt()];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        int ret=maximumWealth(arr);
        System.out.println("Max is "+ret);
    }
    static int maximumWealth(int[][]accounts)
    {
        int sum=0;
        int[] rich=new int[accounts.length];
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            rich[i]=sum;
            sum=0;
        }
        int max = Integer.MIN_VALUE;
        //or
        //int max=Integer.MIN_VALUE;
        for (int i = 0; i < rich.length; i++) {
            if (max < rich[i]) {
                max = rich[i];
            }
        }
         return max;
    }
    static void max(int[] arr) {
        int max = Integer.MIN_VALUE;
        //or
        //int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max val is "+max);
    }
}
