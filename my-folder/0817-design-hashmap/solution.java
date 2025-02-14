
class Pair
{
    int k;
    int value;
    Pair(int key,int value)
    {
        this.k=key;
        this.value=value;
    }
}
class Node
{
    int k;
    List<Pair> list=new ArrayList<>();
    Node(int key, List<Pair> list)
    {
        this.k=key;
        this.list=list;
    }
}
class MyHashMap {
    Node[] arr;
    int size=10000;
    public MyHashMap() {
        arr=new Node[size];
    }
    
    public void put(int key, int value) {
        Pair p=new Pair(key,value);
        if(this.arr[key%size]==null)
        {
            List<Pair> l=new ArrayList<>();
            l.add(p);
            Node node=new Node(key,l);
            this.arr[key%size]=node;
        }
        else{
            Node node=this.arr[key%size];
            List<Pair> l=node.list;
            boolean flag=false;
            for(int i=0;i<l.size();i++)
            {
                if(l.get(i).k==key)
                {
                    l.get(i).value=value;
                    node.list=l;
                    flag=true;
                    break;
                }
            }
            if(!flag)
            l.add(p);
            this.arr[key%size]=node;
        }
    }
    
    public int get(int key) {
        //System.out.println("0 "+key);
        Node node=arr[key%size];
        if(node==null) 
        {
            return -1;
        }else{
            List<Pair> l=node.list;
            for(int i=0;i<l.size();i++){
                if(l.get(i).k==key)
                {
                    return l.get(i).value;
                }
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        Node node=arr[key%size];
        if(node==null) return;
        List<Pair> l=node.list;
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).k==key)
            {
                l.remove(i);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
