class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if (temp == '(') {
                stack.push(')');
            } else if (temp == '[') {
                stack.push(']');
            } else if (temp == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || stack.pop() != temp) {
                    return false;
                }
            }
        }
            
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
