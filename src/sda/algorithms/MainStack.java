package sda.algorithms;

import sda.algorithms.algorithms.BalancedParenthesis;

public class MainStack {

    public static void main(String[] args) {
        String[] input = new String[]{"(()()()())", "(((())))", "(()((())()))", "((((((())", "()))", "(()()(()"};
        for (String parenthesis : input) {
            BalancedParenthesis checker = new BalancedParenthesis(parenthesis);
            boolean balanced = checker.check();
            System.out.println(balanced);
        }
    }

}
