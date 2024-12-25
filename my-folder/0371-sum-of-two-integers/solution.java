class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int answer = a ^ b;
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }
        return a;
    }
}
/*
(a*b)/a
a=10
b=11
ans: 01
c : 100
a=001
b=100;
ans: 101
c : 000
b=000
*/
