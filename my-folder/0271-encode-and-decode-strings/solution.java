public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        //str.append(strs.get(0));
        for(int i=0;i<strs.size();i++)
        {
            if(strs.get(i).length()==0)
            {
                str.append("Emptyπ");
            } else
            str.append(strs.get(i)+"π");
        }
        return str.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String[] arr=s.split("π");
        List<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("Empty")) list.add("");
            else
            list.add(arr[i]);
        }
        return list;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
