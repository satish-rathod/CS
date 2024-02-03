#include <iostream>
#include <vector>
using namespace std;

const int MOD = 1e9 + 7;

vector<vector<vector<vector<int>>>> memo(151, vector<vector<vector<int>>>(61, vector<vector<int>>(11, vector<int>(101, -1))));

int dp(int i, int j, int k, int l, int N) {
    if (i == 0 && j == 0 && k == 10) {
        return (l >= 100) ? 1 : 0;
    }
    if (j == 0 || k == 10) {
        return 0;
    }

    if (memo[i][j][k][l] != -1) {
        return memo[i][j][k][l];
    }

    int total_ways = 0;
    total_ways = (total_ways + dp(i - l, j - 1, k + 1, l, N)) % MOD;       // Wicket
    total_ways = (total_ways + dp(i - l + 1, j - 1, k + 1, l + 1, N)) % MOD; // 1 run
    total_ways = (total_ways + dp(i - l + 2, j - 1, k + 1, l + 2, N)) % MOD; // 2 runs
    total_ways = (total_ways + dp(i - l + 3, j - 1, k + 1, l + 3, N)) % MOD; // 3 runs
    total_ways = (total_ways + dp(i - l + 4, j - 1, k + 1, l + 4, N)) % MOD; // 4 runs
    total_ways = (total_ways + dp(i - l + 6, j - 1, k + 1, l + 6, N)) % MOD; // 6 runs

    memo[i][j][k][l] = total_ways;
    return total_ways;
}

int solve(int N, int b, int w, int x) {
    int total_ways = dp(N, b, w, x, N);
    total_ways %= MOD;

    // Calculate the probability p * q^-1 modulo 10^9 + 7
    long long inverse_q = 1;
    for (int i = 0; i < 6; ++i) {
        inverse_q = (inverse_q * 6) % MOD;
    }

    long long result = (total_ways * inverse_q) % MOD;

    return result;
}

int main() {
    int T;
    cin >> T;

    for (int t = 0; t < T; ++t) {
        int N, b, w, x;
        cin >> N >> b >> w >> x;
        int result = solve(N, b, w, x);
        cout << result << endl;
    }

    return 0;
}