#include <bits/stdc++.h>
using namespace std;

#define int long long


int gcd(int a, int b) {
    return __gcd(a, b);
}

vector<int> swap(vector<int>& arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
}

vector<int> computeSequence(int L, int R) {
    vector<int> ans(R - L + 1);
    ans[0] = L + 1;
    ans[R - L] = L;

    for (int i = 1; i < R - L; i++) {
        ans[i] = ans[i - 1] + 1;
    }

    if (gcd(ans[R - L], R) != 1) {
        
        int len = 1;
        while(gcd(ans[len],R)!=1 && gcd(ans[len],L+len)!=1)
        {
            len+=2;
        }
        
        ans = swap(ans, R - L,  len);
    }

    return ans;
}

int32_t main() {
    int t;
    cin >> t;

    for (int i = 0; i < t; i++) {
        int L, R;
        cin >> L >> R;

        if (L % 2 == 0 && R % 2 == 0) {
            cout << -1 << endl;
            continue;
        }

        vector<int> ans = computeSequence(L, R);

        for (int j = 0; j < ans.size(); j++) {
            cout << ans[j] << " ";
        }
        cout << endl;
    }

    return 0;
}
