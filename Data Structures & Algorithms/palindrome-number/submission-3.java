class Solution {
    public boolean isPalindrome(int x) {
     int div = 1;
     int right, left;

     if(x < 0) {
        return false;
     }

     while(x / 10 >= div) {
        div *= 10;
     }

     while(x > 0) {
        right = x % 10;
        left = x / div;
        if(left != right) {
            return false;
        }
        x = (x % div) / 10;
        div = div / 100;
     }
      
     return true; 
    }
}