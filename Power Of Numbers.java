 class Solution {
    public int reverseExponentiation(int n) {
        // code here
    int rev =0;
    int temp =n;
    while(temp>0)
    {
        int rem = temp%10;
     rev = rev*10+rem;
     temp= temp/10;
    }
    int result =1;
    for(int i =0;i<rev;i++)
    {
        result = result*n;
    }
    return result;
    
    
    }
    
}
