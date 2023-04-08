import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] result = new int[nums.length + nums.length];
         int[] arr2=new int[nums.length];
         for(int i=0;i<arr2.length;i++)
         {
             arr2[i]=nums[i];
         }
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(arr2, 0, result, nums.length, arr2.length);
        return result;
    }
}
