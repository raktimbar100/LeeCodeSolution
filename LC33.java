class Solution {
    public int search(int[] nums, int target) {
         int start=0;
        int end= nums.length-1;
        int pi=pivot(nums);
        if(pi==-1)
        {
            return binarysearch(nums,target,start,end);
        }
        if(nums[pi]==target)
        {
            return pi;
        }
        if(target>=nums[start])
        {
            return binarysearch(nums,target,start,pi-1);
        }

    return binarysearch(nums,target,pi+1,end);

    }
   int pivot(int[] nums)
    {
        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid=(start+(end-start)/2);
            if( mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start&&nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(nums[mid]<=nums[start])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
     int binarysearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=(start+(end-start)/2);
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
