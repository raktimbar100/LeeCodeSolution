import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum=0;
        List<Boolean> l=new ArrayList<Boolean>();
        int max=Integer.MIN_VALUE;
        int[] du=new int[candies.length];
        boolean b=false;
        for(int i=0;i<candies.length;i++)
        {
           for(int j=0;j<candies.length;j++)
           {
               if(j!=i){
                   if(candies[i]+extraCandies>=candies[j]){
                        b=true;
                   }
                   else{
                       b=false;
                       break;
                   }
               }
           }
           l.add(b);
        }
        return l;

    }
}
