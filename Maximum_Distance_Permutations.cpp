#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve(int N) {
    // Permutation A
    vector<int> A(N);
    for (int i = 0; i < N; ++i) {
        A[i] = i + 1;
    }
    
    // Permutation B (reverse of A)
    vector<int> B = A;
    reverse(B.begin(), B.end());
    
    // Output the permutations
    for (int i = 0; i < N; ++i) {
        cout << A[i] << (i == N - 1 ? "\n" : " ");
    }
    for (int i = 0; i < N; ++i) {
        cout << B[i] << (i == N - 1 ? "\n" : " ");
    }
}

int main() {
    int T;
    cin >> T;
    while (T--) {
        int N;
        cin >> N;
        solve(N);
    }
    return 0;
}
