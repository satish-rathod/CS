#include <iostream>
using namespace std;
#define int long long

const int mod = 1000000007;

int power(int x, int y, int p) {
    int res = 1;
    x = x % p;
    while (y > 0) {
        if (y & 1)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}

int modSub(int a, int b, int p) {
    return ((a%p - b%p) % p + p) % p;
}

int modMul(int a, int b, int p) {
    return ((a % p) * (b % p)) % p;
}

int modDiv(int a, int b, int p) {
    int inv = power(b, p - 2, p);
    return (a % p * inv % p) % p;
}

// void solve();
void solve() {
    int n;
    cin >> n;
    int ans = 1;
    int k = 69;
    for (int i = 0; i < n; i++) {
        int x, y;
        cin >> x >> y;
        int num = power(x, k * y + k, mod);
        num = modSub(num, 1, mod);
        int den = power(x, k, mod);
        den = modSub(den, 1, mod);
        ans = modMul(ans, modDiv(num, den, mod), mod);
    }
    cout << ans << endl;
}

int32_t main() {
    solve();
    return 0;
}

