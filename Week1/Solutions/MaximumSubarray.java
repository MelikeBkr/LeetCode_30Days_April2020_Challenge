class Solution {
    public int maxSubArray(int[] nums)
    {
        int n = nums.length;
        int soFarMax = nums[0];
        int max = nums[0];
        for (int i=1; i<n; i++)
        {
            soFarMax = max(nums[i], soFarMax+nums[i]);
            max = max(max, soFarMax);
        }
        return max;
    }

    public int max(int a, int b)
    {
       return a>b?a:b;
    }
}