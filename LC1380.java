import java.util.ArrayList;
class Solution {
         public List<Integer> luckyNumbers (int[][] matrix){

             List<Integer> row=new ArrayList<>();
              List<Integer> col=new ArrayList<>();
               List<Integer> ans=new ArrayList<>();
            for(int i=0;i<matrix.length;i++)
            {
                int min=Integer.MAX_VALUE;//999999999
                for(int j=0;j<matrix[0].length;j++)
                {
                        if(min>matrix[i][j])
                        {
                            min=matrix[i][j];
                        }
                }
                row.add(min);
            }
            for(int i=0;i<matrix[0].length;i++)
            {
                int max=Integer.MIN_VALUE;
                for(int j=0;j<matrix.length;j++)
                {
                    if(max<matrix[j][i])
                    {
                        max=matrix[j][i];
                    }
                }
                col.add(max);
            }
            for(int i:row)
            {
                for(int j:col)
                {
                    if(i==j)
                    {
                        ans.add(i);
                    }
                }
            }
      return ans;
            
    }
}
