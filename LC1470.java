class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[n];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=nums[nums.length-1-i];
        }
        int start=0;
        int end=ans.length-1;
        while(start<end)
        {
            int temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
        int[] ret=new int[nums.length];
        boolean flag=true;
        int k=0,l=0;
        for(int i=0;i<ret.length;i++)
        {
                if(flag==true && k<nums.length/2)
                {
                    ret[i]=nums[k];
                    k++;
                    flag=false;
                }
                else{
                    ret[i]=ans[l];
                    l++;
                    flag=true;
                }
        
        }
        return ret;
    }
}
