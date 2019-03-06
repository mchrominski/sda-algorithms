package sda.algorithms.algorithms;

import sda.algorithms.data.Stack;

public class BalancedParenthesis {

    private String parenthis;

    public BalancedParenthesis(String parenthis) {
        this.parenthis = parenthis;
    }

    public boolean check() {
        System.out.println(parenthis);

        Stack stack = new Stack(100);
        int index = 0;
        boolean balanced = true;
        while (index < parenthis.length() && balanced) {
            char symbol = parenthis.charAt(index);
            if (symbol == '(') {
                stack.push(1);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                } else {
                    stack.pop();
                }
            }
            index++;
        }

        return balanced && stack.isEmpty();
    }
}
