#include <iostream>
#include <algorithm>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int t;
    std::cin >> t;

    while (t-- > 0) {
        int n, k;
        std::cin >> n >> k;

        std::vector<int> arr(n);

        for (int i = 0; i < n; i++) {
            std::cin >> arr[i];
        }

        std::sort(arr.begin(), arr.end());

        int max = 0, min = 0;

        if (k != 1) {
            for (int i = 0; i < k - 1; i++) {
                min += arr[i];
            }
            min += arr[n - k - 1];
        } else {
            min = arr[n - 2];
        }

        for (int i = n - 2; i >= n - 2 * k; i -= 2) {
            max += arr[i];
        }

        std::cout << min << " " << max << '\n';
    }

    return 0;
}
