class Solution {
    //312
    //31
    //3
    //.3

    public int sumOfDigits(int n) {
        var sum = 0;
        while(n >= 1) {
            var digit = n%10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
       int slow = n;
       int fast = sumOfDigits(n);
       if(slow == 1) {
            return true;
        }
        
       while(slow != fast) {
        slow = sumOfDigits(slow);
        fast = sumOfDigits(sumOfDigits(fast));
        if(slow == 1) {
            return true;
        }
       }
       return false;
    }
}
