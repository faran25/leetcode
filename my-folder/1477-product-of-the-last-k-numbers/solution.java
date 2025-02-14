class ProductOfNumbers {
    List<Integer> product;
    int prod=1;
    int size=0;
    public ProductOfNumbers() {
        product=new ArrayList<>();
        product.add(1);
        size=0;
    }
    
    public void add(int num) {
        if(num==0)
        {
            product=new ArrayList<>();
            product.add(1);
            size=0;
            prod=1;
        }
        else{
            prod=prod*num;
            product.add(prod);
            size++;
        }
    }
    
    public int getProduct(int k) {
        if(k>size) return 0;
        return product.get(size)/product.get(size-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
