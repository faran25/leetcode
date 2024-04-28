class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0; // x^0 = 1
        }

        // Convert n to long to handle Integer.MIN_VALUE case
        long p = n;
        if (p < 0) {
            x = 1 / x;
            p = -p;
        }

        double result = 1.0;
        while (p > 0) {
            if (p % 2 == 1) {
                result *= x; // Multiply by x if the current bit of n is set
            }
            x *= x; // Square x for each iteration
            p /= 2; // Right shift p to check the next bit
        }

        return result;
    }
}

