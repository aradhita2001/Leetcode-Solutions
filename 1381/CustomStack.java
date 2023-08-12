class CustomStack {
    int maxSize;
    int currSize;
    int[] elements;

    public CustomStack(int maxSize) {
        
        this.maxSize = maxSize;
        this.currSize = 0;
        elements = new int[maxSize];
    }
    
    public void push(int x) {
        if(currSize < maxSize){
            elements[currSize++] = x;
        }
    }
    
    public int pop() {

        if(currSize == 0) return -1;

        return elements[--currSize];
        
    }
    
    public void increment(int k, int val) {
        
        if(k > maxSize) increment(maxSize, val);
        else{

            for(int i = 0; i < k; i++){
                elements[i]+= val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */