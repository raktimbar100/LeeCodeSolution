class Solution {
    public int findDuplicate(int[] nums) {
         int i=0;
        while(i<nums.length)
        {
            int correct=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correct])
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
                return nums[i];
            }
           
        }
        return -1;
    }
     void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
