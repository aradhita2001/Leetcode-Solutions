class Solution {
    public double myPow(double x, int n) {
        
        if(n == 1)  return x;
        if(n == -1) return 1/x;
        if(n == 0) return 1;

        if(n== Integer.MIN_VALUE) return myPow(x, n+1) / x;

        if(n < 0) return 1 / myPow(x, -n);

        double temp = myPow(x, n/2);

        return n % 2 == 0 ? temp * temp : temp * temp * x;
    }
}