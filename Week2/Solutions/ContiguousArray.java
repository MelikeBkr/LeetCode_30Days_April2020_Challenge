class Solution {
    public int findMaxLength(int[] nums)
    {
        if(nums.length==0 || nums==null)
        {
            return 0;
        }

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int result = 0;
        int counter = 0;
        for(int i=0; i<nums.length; i++)
        {
            counter += nums[i] == 0 ? -1 : 1;
            
            if(countMap.containsKey(counter) && counter !=0)
            {
                result = Math.max(result, i-countMap.get(counter));
            }
            else
            {
                countMap.put(counter,i);
                
                if(counter==0)
                {
                    result = Math.max(result, i+1);
                }
            }
        }

        return result;

    }
}