class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] result = new int[n];

        int left=1;
        for(int i=0; i<n; i++)
        {
            result[i] = left;
            left = nums[i]*left;
        }
        int right =1;
        for(int i=n-1; i>=0; i--)
        {
            result[i] = result[i]*right;
            right = nums[i]*right;
        }

        return result;
    }
}