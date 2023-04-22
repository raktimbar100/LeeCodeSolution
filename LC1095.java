class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int pk=peak(mountainArr);
        int firstHalf=bs(mountainArr,target,0,pk);
       // MountainArray secondhalf=bs(arr,target,pk+1,mountainArr.length-1);
        if(firstHalf!=-1)
        {
            return firstHalf;
        }
        return bs(mountainArr,target,pk+1,mountainArr.length()-1);
        
    }
    static int bs(MountainArray mountainArr,int target,int start,int end)
    {
        boolean asc=mountainArr.get(start) < mountainArr.get(end);

        while(start<=end)
        {
            int mid=(start+(end-start)/2);
            if(asc){
            if(mountainArr.get(mid)>target)
            {
                end=mid-1;
            }
            else if(mountainArr.get(mid)<target)
            {
                start=mid+1;
            }
            else{
                return mid;
            }
            }
            else{
                if(mountainArr.get(mid)>target){
                    start=mid+1;
                }
                else if(mountainArr.get(mid)<target)
                {
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
    static int peak(MountainArray mountainArr)
    {
        int start=0;
        int  end=mountainArr.length()-1;
        while(start<end)
        {
            int  mid=(start+(end-start)/2);
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
