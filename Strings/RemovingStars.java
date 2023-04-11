/*
* Given a string "leetco*de*", remove the star and the nearest non-star char
* to the left of it. Expected = "leetcd"
*
* Use a stack to progressively build the string, if you run into a * -> pop the stack
* Convert resulting stack to a string.
*/

class RemovingStars {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] != '*') {
                stack.push(c[i]);
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return s = new String(sb.reverse());

    }
}
