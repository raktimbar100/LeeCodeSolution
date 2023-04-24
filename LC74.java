class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int demo=search(matrix,target);
        if(demo==target)
        {
            return true;
        }
        return false;
    }
     int search(int[][] mat,int target)
    {
        int row=0;
        int col=mat[0].length-1;
        while(row<mat.length && col>=0)
        {
            if(target==mat[row][col])
            {
                return mat[row][col];
            }
            if(target>mat[row][col])
            {
                row++;
            }
            else{
                col--;
            }
        }
       return -1;
    }
}
