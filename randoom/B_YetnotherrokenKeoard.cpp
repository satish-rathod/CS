#include <iostream>
#include <stack>
#include <string>
#include <algorithm>

using namespace std;

bool isUpp(char c) {
    return c >= 'A' && c <= 'Z';
}

bool isLow(char c) {
    return c >= 'a' && c <= 'z';
}

void solve() {
    string s;
    cin >> s;
    int n = s.size();
    stack<pair<int, char>> u;
    stack<pair<int, char>> l;

    for (int i = 0; i < n; i++) {
        char c = s[i];
        if (c == 'B' && !u.empty()) {
            u.pop();
        }
        if (c == 'b' && !l.empty()) {
            l.pop();
        }
        if (isUpp(c) && c != 'B') {
            u.push({i, c});
        }
        if (isLow(c) && c != 'b') {
            l.push({i, c});
        }
    }

    string ans = "";
    while (!u.empty() && !l.empty()) {
        if (u.top().first > l.top().first) {
            ans += u.top().second;
            u.pop();
        } else {
            ans += l.top().second;
            l.pop();
        }
    }
    while (!u.empty()) {
        ans += u.top().second;
        u.pop();
    }
    while (!l.empty()) {
        ans += l.top().second;
        l.pop();
    }
    reverse(ans.begin(), ans.end());
    cout << ans << endl;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t = 1;
    cin >> t;
    while (t--) {
        solve();
    }

    return 0;
}
