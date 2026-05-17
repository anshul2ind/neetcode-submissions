class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] arr = s.toCharArray();
        List<Character> stack = new ArrayList();
        for(var ch : arr) {
            if(map.containsKey(ch)) {
                if(stack.size() == 0) {
                    return false;
                } else if(stack.get(stack.size() - 1) == map.get(ch)) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            } else {
                stack.add(ch);
            }
        }

        return stack.size() == 0;
        
    }
}
