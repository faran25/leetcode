class Solution {
    public int[] maxSlidingWindow(int[] A, int B) {
        if(B==1) return A;
        if(B>=A.length)
        {
            int max=A[0];
            for(int i=1;i<A.length;i++)
            {
                if(A[i]>max) max=A[i];
            }
            return new int[]{max};
        }
        Deque<Integer> dq=new ArrayDeque();
        
        int []ans=new int[A.length-B+1];
        
        for(int i=0;i<B;i++)
        {
            while(dq.size()>0 && A[i]>dq.peekLast())
            {
                dq.removeLast();
            }
            dq.addLast(A[i]);
        }
        int k=0;
        ans[0]=dq.peek();
        for(int i=B;i<A.length;i++)
        {
            if(A[k]==dq.peek())
            {
                dq.removeFirst();
            }
            while(dq.size()>0 && A[i]>dq.peekLast())  
            {
                dq.removeLast();
            }
            dq.addLast(A[i]);
            ans[++k]=dq.peekFirst();
        }
        return ans;
        
    }
}
