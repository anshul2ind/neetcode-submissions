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
        Set<Integer> hashset = new HashSet<Integer>();
        while(n != 1) {
            hashset.add(n);
            n = this.squareOfDigits(n);
            if (hashset.contains(n) && n != 1) {
                return false;
            }
        }

        return true;
    }
}
