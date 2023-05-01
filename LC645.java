class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
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
            if(i+1!=nums[i])
            {
               ans[0]=nums[i];
               ans[1]=i+1;
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
