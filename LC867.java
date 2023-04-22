class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] nemat= new int[col][row];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                nemat[j][i]=matrix[i][j];
            }
        }
        return nemat;
    }
}
