import java.util.ArrayList;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int init=nums[i];
            count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                {
                    continue;
                }

                if(init>nums[j])
                {
                   ++count;
                }
            }
            li.add(count);
        }
        int[] ans=new int[nums.length];
        int j=0;
        for(int i:li)
        {
            ans[j]=i;
            j++;
        }
        return ans;
    }
}
