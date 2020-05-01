class FirstUnique {

    LinkedHashMap<Integer,Integer> elementCountMap = new LinkedHashMap<Integer, Integer>();

    public FirstUnique(int[] array)
    {
        for (int item: array)
        {
            if(elementCountMap.containsKey(item))
            {
                int value = elementCountMap.get(item);

                elementCountMap.replace(item,value+1);
            }
            else
            {
                elementCountMap.put(item,1);
            }
        }
    }


    public int showFirstUnique()
    {
        int result = 0;
        for(int k:elementCountMap.keySet())
        {
            if(elementCountMap.get(k)==1)
            {
                return k;
            }
        }
        return -1;
    }
    public void add(int n)
    {
        if(elementCountMap.containsKey(n))
        {
            int value = elementCountMap.get(n);
            elementCountMap.remove(n,value);
            elementCountMap.put(n,value+1);
        }
        else
        {
            elementCountMap.put(n,1);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */