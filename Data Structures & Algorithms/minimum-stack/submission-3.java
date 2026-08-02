class MinStack {
    LinkedList<Integer> stack = new LinkedList();
    LinkedList<Integer> minStack = new LinkedList();
    int min = Integer.MAX_VALUE;


    public MinStack() {
        
    }
    
    public void push(int val) {
        min = Math.min(val, min);
        stack.addLast(val);
        minStack.addLast(min);
    }
    
    public void pop() {
        stack.removeLast();
        minStack.removeLast();
        if(stack.size() == 0) {
            min = Integer.MAX_VALUE;
        } else {
             min = minStack.peekLast();
        }
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return min;
    }
}
