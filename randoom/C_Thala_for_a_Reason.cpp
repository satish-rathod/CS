
// #include <iostream>
// using namespace std;

// int dfs(int rr, int lw) {
//     if (lw <= 0) return 0;
//     if (rr <= 0) return 1;
//     cout << rr << " " << lw << "\n";

//     int ans = 0;
//     for (int i = 1; i <= 6; i++) { 
//         if (i <= 4) {
//             ans += dfs(rr - i, lw);
//         } else if (i == 5) {
//             ans += dfs(rr - 6, lw);
//         } else {
//             ans += dfs(rr, lw - 1);
//         }
//     }
//     return ans;
// }

// int main() {
//     int rr, lw;
//     cin >> rr >> lw;
//     cout << dfs(rr, lw) << "\n";
//     return 0;
// }
#include <iostream>
using namespace std;

int dfs(int rr, int lw, int bl) {
    // Base cases
    if (rr > 36) return 0;
    if (rr <= 0 && lw > 0) return 1;  // If no runs needed, exactly one way to win (by scoring no runs)
    if (lw <= 0) return 0;  // If no wickets left, no possible way to win
    if (bl <= 0) return 0;

    // Recursive cases
    int ans = 0;
    for (int i = 0; i <= 6; i++) {
        if (i <= 4) {
            // If i represents a run (1 to 4), decrement runs and continue
            ans += dfs(rr - i, lw, bl - 1);
        } else if (i == 5) {
            // If i represents a wicket, decrement wickets and continue
            ans += dfs(rr - 6, lw, bl - 1);
        } else {
            // If i represents a wide, decrement wickets and continue
            ans += dfs(rr, lw - 1, bl - 1);
        }
    }
    return ans;
}

int main() {
    int rr, lw;
    cin >> rr >> lw;
    cout << dfs(rr, lw, 6) << "\n";
    return 0;
}

