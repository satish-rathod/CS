import java.util.Scanner;

class Yet_Another_Alice_Bob_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            String winner = determineWinner(N, A, B);
            System.out.println(winner.toUpperCase());
        }

        scanner.close();
    }

    public static String determineWinner(int N, int A, int B) {
        if(A==B)
            return "BOB";

    int winningState = (A - B) * ((N / (A - B)) + 1);

    if (N % winningState == 0) {
        boolean aliceTurn = true;
        while (N > 0) {
            int stonesToRemove = winningState > 0 ?
                    Math.min(Math.min(A, N), Math.min(B, N - winningState)) : 1;
            N -= stonesToRemove;
            aliceTurn = !aliceTurn;
        }
        return aliceTurn ? "Bob" : "Alice";
    } else {
        return "Alice";
    }
}

}
