import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SubArrayGivenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter sum ");
        int sum= sc.nextInt();
        subArraySum(arr,sum);
    }
    static void subArraySum(int[] arr,int sum)
    {
        ArrayList<Integer> answer=new ArrayList<>();
        int cal=arr[0];
        int left=0,right=0;
        if(sum==0){
            answer.add(-1);
        }
        boolean ans=false;
        while(right<arr.length){
            if(cal==sum){
                ans=true;
                break;
            }
            else if(cal<sum){

                if(right<arr.length) {
                    right++;
                    cal += arr[right];
                }

            }
            else{
                cal-=arr[left];
                left++;
            }
        }
        if(ans){
            answer.add(left+1);
            answer.add(right+1);
        }
        else{
            answer.add(-1);
        }
        for(int j:answer){
            System.out.println(j);
        }
    }
}
