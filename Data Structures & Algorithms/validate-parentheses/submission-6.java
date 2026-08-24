class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');

        for (var ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char poped = stack.pop();
                if (poped != map.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
