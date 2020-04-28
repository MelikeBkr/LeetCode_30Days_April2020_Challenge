class Solution {
    public void moveZeroes(int[] nums)
    {
        int n = nums.length;
        int zeroCount = 0;
        int j=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0)
            {
                nums[j++] = nums[i];
            }
            else
            {
                zeroCount++;
            }
        }
        for(int k=n-zeroCount; k<n; k++)
        {
            nums[k] = 0;
        }
    }
}