package easy;

import java.util.ArrayDeque;
import java.util.Map;

public class Daily20 {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        var openingParentheses = Map.of('(', ')', '[', ']', '{', '}');

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (openingParentheses.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                var lastOpen = stack.pop();
                if (!openingParentheses.get(lastOpen).equals(c)) return false;
            }
        }

        return stack.isEmpty();
    }

}
