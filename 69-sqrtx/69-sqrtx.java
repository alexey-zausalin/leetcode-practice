class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        int l = 1, r = x / 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sqrtX = x / mid;

            if (sqrtX == mid) {
                return mid;
            }
            
            if (sqrtX > mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return r;
    }
}