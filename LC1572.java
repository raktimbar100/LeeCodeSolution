class Solution {
    public int diagonalSum(int[][] mat) {
           int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j]+mat[i][mat[i].length-1-i];
                    int len=mat[i].length-1-i;
                    if(j==len)
                    {
                        sum-=mat[i][j];
                    }
                }


            }
        }
        return sum;
    }
}
