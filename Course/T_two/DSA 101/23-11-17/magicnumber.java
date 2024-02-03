class magicnumber {

    public static void magic(int[] A) {
        int len = A.length;
        int s = 0;
        int e = len - 1;

        boolean flag = false;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (A[mid] == mid) {
                System.out.println("Magic index is: " + mid);
                flag = true;
                break;
            } else if (A[mid] > mid) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

            if (flag == false) {
                System.out.println("No magic index");
            }
        }

    }

    public static void main(String[] args) {
        int[] A = { -1, 0, 1, 2, 4, 10 };
        magic(A);
    }
}