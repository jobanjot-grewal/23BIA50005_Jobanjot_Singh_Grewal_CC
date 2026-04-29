class Solution {
    int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n / 2, result = 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (mid <= n / mid) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
