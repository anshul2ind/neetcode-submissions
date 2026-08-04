record Node (int val, int index) {}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<Node> stack = new LinkedList<Node>();
        int len = temperatures.length;
        int[] result = new int[len];
        for(int i = 0 ; i < len; i++) {
            var temp = temperatures[i];
            while(!stack.isEmpty() && temp > stack.peekLast().val()) {
                var node = stack.removeLast();
                result[node.index()] = i - node.index();
            }
            stack.addLast(new Node(temp, i));
        }
        return result;

    }
}
