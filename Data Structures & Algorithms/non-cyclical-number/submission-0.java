// 48
// m = 8 and d = 4



class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n != 1) {
            int squareSum = 0;
            while(n > 0) {
                squareSum += (n%10)*(n%10);
                n /= 10;
            }
        
            if(set.contains(squareSum)) {
                return false;
            }
            set.add(squareSum);
            n = squareSum;

        }
        return true;
    }
}
