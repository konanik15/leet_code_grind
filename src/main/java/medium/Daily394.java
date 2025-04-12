package medium;

import java.util.Stack;

public class Daily394 {
    public String decodeString(String s) {
        char[] a = s.toCharArray();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == ']') {
                processStack(stack);
            } else stack.push(String.valueOf(a[i]));
        }

        return mergedStack(stack);
    }

    private String mergedStack(Stack<String> stack) {
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append(new StringBuilder(s).reverse());
        }
        return sb.toString();
    }

    private void processStack(Stack<String> stack) {
        StringBuilder number = new StringBuilder();
        StringBuilder string = new StringBuilder();
        while (!stack.isEmpty() && (number.isEmpty() || nextNumberInStackIsDigit(stack))) {
            String val = stack.pop();
            if (isNumeric(val)) {
                number.reverse();
                number.append(val);
                number.reverse();
            } else if (!val.equals("[")) {
                string.append(val);
            }
        }

        stack.push(string.toString().repeat(Integer.parseInt(number.toString())));
    }

    private boolean nextNumberInStackIsDigit(Stack<String> stack) {
        return !stack.isEmpty() && Character.isDigit(stack.peek().charAt(0));
    }


    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
