class Solution {
    public int subarraySum(int[] nums, int k)
    {
        if(nums==null || nums.length==0)
        {
            return 0;
        }

        int subArrCounter = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumCountMap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            if(sum==k)
            {
                subArrCounter++;
            }
            if(sumCountMap.containsKey(sum-k))
            {
                subArrCounter += sumCountMap.get(sum-k);
            }
            if(sumCountMap.containsKey(sum))
            {
                sumCountMap.replace(sum,sumCountMap.get(sum)+1) ;
            }
            else
            {
                sumCountMap.put(sum,1);
            }
        }
        return subArrCounter;
    }
}