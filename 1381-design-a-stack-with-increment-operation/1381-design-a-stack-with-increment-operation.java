class CustomStack {

    private int[] stack;
    private int top;
    private int size;
    public CustomStack(int maxSize) {
        size=maxSize;
        stack=new int[size];
        top=-1;
    }
    
    public void push(int x) {
        if(isFull())
            return;
        stack[++top]=x;
    }
    
    public int pop() {
        if(isEmpty())
            return -1;
        return stack[top--];
        
        
    }
    
    public void increment(int k, int val) {
        if(isEmpty())
            return;
        for(int i=0;i<k && i<stack.length ;i++){
            stack[i]+=val;
        }
    }
    private boolean isFull(){
        if(top==size-1)
            return true;
        return false;
    }
    private boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */