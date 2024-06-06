import java.util.Scanner;

public class dictonery {

    public static void fun(String[] arr, String str){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() == str.length()){
                int j = 0;
                while(j < arr[i].length() && arr[i].charAt(j) == str.charAt(j)){
                    j++;
                }
                if(j == arr[i].length()){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println("No match found");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLine();
            }

            String str = sc.nextLine();

            fun(arr, str);
        }

        sc.close();
    }
}
