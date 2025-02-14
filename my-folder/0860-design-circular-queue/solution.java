class MyCircularQueue {
    int[] arr;
    int l=0;
    int r=0;
    int size=0;
    int k=0;
    public MyCircularQueue(int kk) {
        arr=new int[kk];
        k=kk;
    }
    
    public boolean enQueue(int value) {
        if(size==arr.length) return false;
        arr[r++%k]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size>0) 
        {
            l++;
            size--;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int Front() {
        if(size>0 && size<=arr.length){
            return arr[(l)%k];
        }
        else{
            return -1;
        }
    }
    
    public int Rear() {
        if(size>0 && size<=arr.length){
            return arr[(r-1)%k];
        }
        else{
            return -1;
        }
    }
    
    public boolean isEmpty() {
        if(size<=0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    public boolean isFull() {
        if(size==arr.length) return true;
        return false;
    }
}
/*
6

*/
/**
8
-1 -1 5 0 
 */
 /**
7
-1 4 6 3  
*/
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

