class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<String> stack = new LinkedList();

        for (var str : tokens) {
            switch (str) {
                case "+": {
                    var y = Integer.parseInt(stack.removeLast());
                    var x = Integer.parseInt(stack.removeLast());
                    var result = x + y;
                    stack.addLast(result + "");
                    break;
                }
                case "-": {
                    var y = Integer.parseInt(stack.removeLast());
                    var x = Integer.parseInt(stack.removeLast());
                    var result = x - y;
                    stack.addLast(result + "");

                    break;
                }
                case "*": {
                    var y = Integer.parseInt(stack.removeLast());
                    var x = Integer.parseInt(stack.removeLast());
                    var result = x * y;
                    stack.addLast(result + "");

                    break;
                }

                case "/": {
                    var y = Integer.parseInt(stack.removeLast());
                    var x = Integer.parseInt(stack.removeLast());
                    var result = x / y;
                    stack.addLast(result + "");
                    break;
                }

                default:
                    stack.addLast(str);
            }
        }

        return Integer.parseInt(stack.peekLast());
    }
}
