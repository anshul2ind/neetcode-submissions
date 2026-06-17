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
       int slow = sumOfDigits(n);
       Set<Integer> set = new HashSet();
    //    int fast = sumOfDigits(slow);
       
        while(!set.contains(slow)) {
            set.add(slow);
            if(slow == 1) {
                return true;
            }
            slow = sumOfDigits(slow);
        }
        
    //    while(slow != fast) {
    //     if(fast == 1) {
    //         return true;
    //     }
    //     slow = sumOfDigits(slow);
    //     fast = sumOfDigits(sumOfDigits(slow));
    //    }
       return false;
    }
}
