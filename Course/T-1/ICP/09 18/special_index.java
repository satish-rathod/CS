import java.util.*;
class special_index {
    
    public static ArrayList<Integer> special(int[] arr) {
        ArrayList<Integer> special_index = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int evensum = 0;
            int oddsum = 0;
    
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    evensum += arr[j];
                } else {
                    oddsum += arr[j];
                }
            }
    
            for (int j = i + 1; j < arr.length; j++) {
                if (j % 2 == 0) {
                    oddsum += arr[j];
                } else {
                    evensum += arr[j];
                }
            }
    
            if (evensum == oddsum) {
                special_index.add(i);
            }
        }
    
        return special_index;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> special_index = special(arr);

        if (special_index.size() == 0) {
            System.out.println("No special index found");
        } else {
            System.out.println("Special index found at:");
        }
        
        for(int i=0;i<special_index.size();i++){
            System.out.print(special_index.get(i)+" ");
        }
        sc.close();
    }
}
// time complexity: O(n^2)
// space complexity: O(n)

//try to do it in O(n) time complexity and O(1) space complexity