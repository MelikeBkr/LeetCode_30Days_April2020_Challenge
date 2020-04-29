class Solution {
    public boolean backspaceCompare(String S, String T)
    {
        boolean result = false;
        StringBuilder str1 = new StringBuilder(S);
        StringBuilder str2 = new StringBuilder(T);


        for (int i =0; i<str1.length(); i++)
        {
            if(str1.charAt(i) == '#' && i !=0)
            {
                str1.delete(i-1,i+1);
                i -=2;
            }
            else if(str1.charAt(i) == '#')
            {
                str1.delete(i,i+1);
                i -=1;
            }
        }

        for (int i =0; i<str2.length(); i++)
        {
            if(str2.charAt(i) == '#' && i !=0)
            {
                str2.delete(i-1,i+1);
                i -=2;
            }
            else if(str2.charAt(i) == '#')
            {
                str2.delete(i,i+1);
                i -=1;
            }
        }

        if(str1.toString().equals(str2.toString()))
        {
            result = true;
        }

        return result;
    }
}