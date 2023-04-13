class ValidStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) { 
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int k = 0; k < pushed.length; k++) {
            stack.push(pushed[k]);
            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return popped.length == j;
        }
}
