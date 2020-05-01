class Solution {
    public boolean canJump(int[] nums)
    {
        if(nums.length==1)
        {
            return true;
        }
        int maxCurJump = nums[0];

        for(int i=0; i<nums.length; i++)
        {
            if (maxCurJump <= i && nums[i] == 0)
            {
                return false;
            }

            if (i + nums[i] > maxCurJump)
            {
                maxCurJump = i + nums[i];
            }

            if (maxCurJump >= nums.length - 1)
            {
                return true;
            }

        }
        return false;

    }
}