class Solution {
 public int search(int[] nums, int target)
    {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high)
        {
            int middle = (low+high)/2;
            if(nums[middle]==target)
            {
                return middle;
            }

            if (nums[low] <= nums[middle]) {
                if (nums[low] <= target && target < nums[middle])
                    high = middle - 1;
                else
                    low = middle + 1;
            }
            else
            {
                if(nums[middle]<target && target <=nums[high])
                {
                    low = middle+1;
                }
                else
                {
                    high = middle-1;
                }
            }
        }

        return -1;

    }
}