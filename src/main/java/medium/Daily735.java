package medium;

import java.util.Stack;

public class Daily735 {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            var rightAsteroid = asteroids[i];

            if (rightAsteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                collide(stack, rightAsteroid);
            } else stack.push(rightAsteroid);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    private void collide(Stack<Integer> stack, int rightAsteroid) {
        while (!stack.isEmpty() && stack.peek() > 0) {
            var leftAsteroid = stack.pop();
            if (leftAsteroid == Math.abs(rightAsteroid)) return;
            if (leftAsteroid > Math.abs(rightAsteroid)) {
                stack.push(leftAsteroid);
                return;
            }
        }
        stack.push(rightAsteroid);
    }
}
