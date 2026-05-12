class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        
        int n = mat.length;
        int res[] = new int[n*n];
         int ind =0;
         for(int d =0;d<=2*(n-1);d++)
         {
             if(d%2==0)
             {
             for(int i=n-1;i>=0;i--)
             {
                 int j = d-i;
                 if(j>=0 && j<n)
                 {
                     res[ind++] = mat[i][j];
                 }
             }
         }
         else
         {
            for(int i=0;i<n;i++)
             {
                 int j = d-i;
                 if(j>=0 && j<n)
                 {
                     res[ind++] = mat[i][j];
                 }
             }
         } 
         }
         return res;
    }
}
