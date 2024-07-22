class People {
    public String name;
    public int height;
    public People(String name, int height)
    {
        this.name=name;
        this.height=height;
    }
    public String getName()
    {
        return name;
    }
    public int getHeight()
    {
        return height;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<People> list= new ArrayList<>();

        for(int i=0;i<heights.length;i++)
        {
            People p=new People(names[i],heights[i]);
            list.add(p);
        }
        Collections.sort(list,(s1,s2)->
        s2.getHeight()-s1.getHeight()
        );

        String [] ans=new String[names.length];

        for(int i=0;i<heights.length;i++)
        {
            ans[i]=list.get(i).name;
        }
        return ans;
    }
}
