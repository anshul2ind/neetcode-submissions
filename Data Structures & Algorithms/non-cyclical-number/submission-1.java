// 48
// m = 8 and d = 4



class Solution {

    public int squareOfDigits(int n) {
        int squareSum = 0;
            while(n > 0) {
                squareSum += (n%10)*(n%10);
                n /= 10;
            }
            return squareSum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = this.squareOfDigits(n);
        while(slow != 1 && fast != slow) {
            slow = this.squareOfDigits(slow);
            fast = this.squareOfDigits(this.squareOfDigits(fast));
        }

        return slow == 1;
    }
}
