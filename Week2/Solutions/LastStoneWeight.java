class Solution {
    public int lastStoneWeight(int[] stones)
    {
        if(stones==null)
        {
            return 0;
        }
        int n=stones.length;
        for(int i=0; i<n-1; i++)
        {
            Arrays.sort(stones);
            stones[n - 1] = stones[n - 1] - stones[n - 2];
            stones[n - 2] = 0;
        }
        return stones[n-1];

    }
}