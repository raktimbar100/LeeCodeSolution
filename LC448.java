import java.util.ArrayList;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
         int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
       
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=(i+1))
            {
                ans.add(i+1);
            }
           
        }
       return ans;
    }
    void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
