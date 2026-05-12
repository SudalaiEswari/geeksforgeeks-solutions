class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        k = k%m;
        int res[][] = new int[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                res[i][j] = mat[i][(j+k)%m];
            }
        }
        return res;
    }
}
