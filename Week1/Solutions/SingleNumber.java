class Solution {
    public int singleNumber(int[] nums) 
    {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    int result=0;
	    for(int item:nums)
	    {   
	    	Integer count;
	    	if(map.containsKey(item))
	    	{
	    		count = map.get(item);
	    		count++;
	    	}
	    	else
	    	{
	    		count=1;
	    	}
	    	
	    	map.put(item, count);

		 }
	    
	    for (Map.Entry<Integer, Integer> entry : map.entrySet())  
	    {
	    	if(entry.getValue().equals(1))
	    	{
	    		result = entry.getKey();
	    	}
	    }

	    return result;
    }
}