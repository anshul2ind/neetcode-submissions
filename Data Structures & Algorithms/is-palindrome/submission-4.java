class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] arr = s.toLowerCase().toCharArray();
        while (l < r) {
            while (l < arr.length && !isAlphabetOrDigit(arr[l])) {
                l++;
            }
            while (r > 0 && !isAlphabetOrDigit(arr[r])) {
                r--;
            }
            if (r > 0 && l < arr.length && arr[l] != arr[r]) {
                return false;
            }
            ++l;
            --r;
        }
        return true;
    }

    private boolean isAlphabetOrDigit(char c) {
        var a = 'a';
        var z = 'z';
        var A = 'A';
        var Z = 'Z';
        var zero = '0';
        var nine = '9';
        return (c >= a && c <= z) || (c >= A && c <= Z) || (c >= zero && c <= nine);
    }
}
