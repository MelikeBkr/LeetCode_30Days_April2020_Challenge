class Solution {
    public String stringShift(String s, int[][] shift)
    {
        String result ="";
        List<Character> sList = new ArrayList<>();
        for (char ch : s.toCharArray())
        {
            sList.add(ch);
        }

        for(int i=0; i<shift.length; i++)
        {
            int direction = shift[i][0];
            int amount = shift[i][1];

            //left shift
            if(direction==0)
            {
                for(int j=0; j<amount; j++)
                {
                    sList.add(sList.get(0));
                    sList.remove(0);
                }

            }
            //right shift
            else if(direction==1)
            {
                for(int j=0; j<amount; j++)
                {

                    sList.add(0,sList.get(sList.size() - 1));
                    sList.remove(sList.size() - 1);
                }
            }
        }
        result = sList.stream().map(String::valueOf).collect(Collectors.joining());

        return result;

    }
}