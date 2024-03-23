#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<int> v(n);
        for (int i = 0; i < n; i++) {
            cin >> v[i];
        }

        int curr = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > curr) {
                curr = v[i];
            } else {
                int temp = v[i];
                int j = 2;
                while (temp <= curr) {
                    temp = v[i] * j;
                    j++;
                }
                curr = temp;
            }
        }

        cout << curr << endl;
    }

    return 0;
}
