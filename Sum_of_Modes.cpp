#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

void solve() {
    int T;
    cin >> T;
    while (T--) {
        int N;
        cin >> N;
        string S;
        cin >> S;

        unordered_map<int, long long> count;
        vector<int> prefix(N + 1, 0);
        for (int i = 0; i < N; ++i) {
            prefix[i + 1] = prefix[i] + (S[i] == '1' ? 1 : -1);
        }

        long long totalSum = 0;
        for (int i = 0; i <= N; ++i) {
            totalSum += count[prefix[i]];
            count[prefix[i]]++;
        }

        totalSum += N * (N + 1LL) / 2;

        cout << totalSum << endl;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    solve();
    return 0;
}