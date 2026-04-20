class Solution {

    public int squareOfDigits(int n) {
        int sum = 0;
        while(n >= 1) {
            sum += Math.pow(n%10, 2);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = squareOfDigits(n);

        while(slow != fast) {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        }
        return slow == 1;
    }
}
