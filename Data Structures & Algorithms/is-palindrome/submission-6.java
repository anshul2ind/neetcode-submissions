class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int l = 0, r = arr.length-1;

        while(l < r) {
            while(l < r && !Character.isLetterOrDigit(arr[l])) {
                l++;
            }

            while(l < r && !Character.isLetterOrDigit(arr[r])) {
                r--;
            }

            if(l < r && arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
