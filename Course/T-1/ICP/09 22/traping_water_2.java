public class traping_water_2 {

    class Solution {
        public static int index(int[] arr) {
            int max = arr[0];
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    index = i;
                }
            }
            return index;
        }
    
        public int trap(int[] arr) {
            if (arr == null || arr.length <= 2) {
                return 0;
            }
    
            int max = index(arr);
    
            int water = 0;
            int n = arr.length;
    
            int leftHeight = arr[0];
            int currentCount = 0;
    
            for (int i = 0; i <=max; i++) {
                if (arr[i] >= leftHeight) {
                    leftHeight = arr[i];
                    water += currentCount;
                    currentCount = 0;
                } else {
                    currentCount += leftHeight - arr[i];
                }
            }
    
            int rightHeight = arr[n - 1];
            currentCount = 0;
    
            for (int i = n - 1; i >= max; i--) {
                if (arr[i] >= rightHeight) {
                    rightHeight = arr[i];
                    water += currentCount;
                    currentCount = 0;
                } else {
                    currentCount += rightHeight - arr[i];
                }
            }
    
            return water;
        }
    }
    
}
