class Solution {
    public int countElements(int[] arr)
    {
        int counter = 0;
        List<Integer> checkList = new ArrayList<Integer>(arr.length);
        for (int item:arr)
        {
            checkList.add(item);
        }

        for(int i=0; i<arr.length; i++)
        {
            if(checkList.contains(Integer.valueOf(arr[i]+1)))
            {
                counter++;
            }
        }
        return counter;
    }
}