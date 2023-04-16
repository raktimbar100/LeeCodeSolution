class LC34 {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target=8;
        int[] b=searchRange(nums,target);
        for(int j:b)
        {
            System.out.print("["+j+"]");
        }

    }
     static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums,int target,boolean se)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+(end-start)/2);
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if (target<nums[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(se)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
