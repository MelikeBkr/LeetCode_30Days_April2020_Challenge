class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<List<String>>();

        HashMap<String, List<String>> map = new HashMap();

        String[] sortedStrings = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedStr = String.copyValueOf(temp);
            if(map.containsKey(sortedStr))
            {
                map.get(sortedStr).add(strs[i]);
            }
            else
            {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
               map.put(sortedStr, list);
            }
        }

        for(List<String> itemList:map.values())
        {
            resultList.add(itemList);
        }



    return resultList;
    }
}