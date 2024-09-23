class FrontMiddleBackQueue {
    Queue<Integer> q;
    public FrontMiddleBackQueue() {
        q = new LinkedList<>();
    }
    
    public void pushFront(int val) {
        if(q.isEmpty()){
            q.add(val);
            return;
        }
        Queue<Integer> q2 = new LinkedList<>();
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        q.add(val);
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
    }
    
    public void pushMiddle(int val) {
        int size = q.size();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<size/2;i++){
            q2.add(q.remove());
        }
        q2.add(val);
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
    }
    
    public void pushBack(int val) {
        q.add(val);
    }
    
    public int popFront() {
        if(q.isEmpty()){
            return -1;
        }
       return q.remove();
    }
    
    public int popMiddle() {
        if(q.isEmpty()){
            return -1;
        }
       int size = q.size();
        Queue<Integer> q2 = new LinkedList<>();
        int middle=-1;
        for(int i=0;i<size;i++){
            if(i==(size-1)/2){
                
        middle = q.remove();
        continue;
            }
            q2.add(q.remove());
        }
        
        while(!q2.isEmpty()){
            q.add(q2.remove());
        } 
        return middle;
    }
    
    public int popBack() {
        if(q.isEmpty()){
            return -1;
        }
        Stack<Integer> s = new Stack<>();
        
        Queue<Integer> q2 = new LinkedList<>();
        while(!q.isEmpty()){
            s.push(q.peek());
            q2.add(q.peek());
            q.remove();
        }
        int val = s.pop();
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
        return val;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */