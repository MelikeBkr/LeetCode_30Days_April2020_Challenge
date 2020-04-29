class MinStack {

    Stack<Integer> minStack = new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) 
    {
        minStack.push(x);   
    }
    
    public void pop() 
    {
        minStack.pop();    
    }
    
    public int top() 
    {
        int val = minStack.peek();
        return val;
        
    }
    
    public int getMin()
    {
        Stack<Integer> temp = new Stack();
        Object[] obj = minStack.toArray();

        for (Object item:obj)
        {
            temp.push((int)item);
        }

        int min=temp.peek();

        while(!temp.isEmpty())
        {
            int current = temp.pop();

            if (current < min)
            {
                min = current;
            }
        }
    return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */