class Solution {
    int missingNum(int arr[] ) {
        int n = arr.length+1;
        long totalsum = (long) n *(n+1)/2  ;
        long arrsum = 0L ;
        for(int i =0;i<arr.length;i++)
        {
            arrsum = arrsum + arr[i];
        }
        return (int) (totalsum- arrsum);
        
    }
}
