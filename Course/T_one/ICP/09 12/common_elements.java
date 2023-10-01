public class common_elements {

    public static int[] commons(int A[], int B[]) {
        int[] arr1 = new int[A.length];
        int size = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    arr1[size] = A[i];
                    size++;
                }
            }
        }
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 2, 3, 4, 5 };
        int[] C = commons(A, B);
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }

}
// rewrit the code using arraylist
// public class common_elements {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int testcase = sc.nextInt();
//
// for (int i = 0; i < testcase; i++) {
// int size = sc.nextInt();
// ArrayList<Integer> arr1 = new ArrayList<Integer>();
// ArrayList<Integer> arr2 = new ArrayList<Integer>();
// for (int j = 0; j < size; j++) {
// arr1.add(sc.nextInt());
// }
// for (int j = 0; j < size; j++) {
// arr2.add(sc.nextInt());
// }
// for (int j = 0; j < size; j++) {
// if (arr1.contains(arr2.get(j))) {
// System.out.print(arr2.get(j) + " ");
// }
// }
// System.out.println();
// }
// int size = sc.nextInt();
// int query = sc.nextInt();
// ArrayList<Integer> arr1 = new ArrayList<Integer>();
//
// for (int i = 0; i < size; i++) {
// arr1.add(sc.nextInt());
// }
//
// System.out.println(arr1.contains(query));
//
// sc.close();
// }
// }
