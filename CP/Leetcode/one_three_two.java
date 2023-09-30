import java.util.Stack;
class Solution {
    public boolean find132pattern(int[] nums) {
        int len = nums.length;

        int[] minArray = new int[len];
        minArray[0] = nums[0];

        for (int i = 1; i < len; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int j = len - 1; j >= 0; j--) {
            if (nums[j] > minArray[j]) {
                while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }

                stack.push(nums[j]);
            }
        }

        return false;
    }
}
