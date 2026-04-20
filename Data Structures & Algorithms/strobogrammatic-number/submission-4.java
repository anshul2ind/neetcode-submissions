class Solution {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> revereNumber = new HashMap<>();
        revereNumber.put('9', '6');
        revereNumber.put('6', '9');
        revereNumber.put('8', '8');
        revereNumber.put('0', '0');
        revereNumber.put('1', '1');
        int left = 0;
        int right = num.length() - 1;

        while(left <= right) {
            if(!revereNumber.containsKey(num.charAt(left)) || revereNumber.get(num.charAt(left)) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
