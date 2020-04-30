class Solution {
    public boolean checkValidString(String s)
    {
        if(s==null)
        {
            return true;
        }
        Stack<Integer> leftParenthesisStack = new Stack<Integer>();
        Stack<Integer> asteriksStack = new Stack<Integer>();
        char[] ch = s.toCharArray();
        for(int i=0; i<s.toCharArray().length; i++)
        {
            if(ch[i]=='(')
            {
                leftParenthesisStack.push(i);
            }
            else if(ch[i]==')')
            {
                if(!leftParenthesisStack.isEmpty())
                {
                    leftParenthesisStack.pop();
                }
                else if(!asteriksStack.isEmpty())
                {
                    asteriksStack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(ch[i]=='*')
            {
                asteriksStack.push(i);
            }
        }
        while (!leftParenthesisStack.isEmpty() && !asteriksStack.isEmpty())
        {
            int index = asteriksStack.pop();
            if(leftParenthesisStack.peek() < index)
            {
                leftParenthesisStack.pop();
            }
        }


    return leftParenthesisStack.isEmpty();
    }
}