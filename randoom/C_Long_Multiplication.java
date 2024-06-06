#include <iostream>
#include <string>

using namespace std;

void solve();

void swap(string& x, string& y, int i);

int main() {
    int t;
    cin >> t;
    cin.ignore(); // consume newline
    while (t-- > 0) {
        solve();
    }
    return 0;
}

void solve() {
    string x, y;
    cin >> x >> y;
    bool ya = true;
    for (int i = 0; i < x.length(); i++) {
        if (x[i] == y[i]) continue;
        else if (ya) {
            if (y[i] > x[i]) swap(x, y, i);
            ya = false;
        } else {
            if (x[i] > y[i]) swap(x, y, i);
        }
    }
    cout << x << endl;
    cout << y << endl;
}

void swap(string& x, string& y, int i) {
    char temp = x[i];
    x[i] = y[i];
    y[i] = temp;
}
