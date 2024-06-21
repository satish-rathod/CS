#include <iostream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

#define int long long

int fun(vector<int>& arr, int a, int b) {
    int cost1=0;
    for(int i=1;i<a;i++){
        cost1+=arr[0]*arr[i];
    }
    if(cost1<=b){
        return 1;
    }
    vector<vector<int>> graph(a + 1);
    for (int i = 0; i <= a; i++) {
        graph[i] = vector<int>();
    }

    vector<int> nodes;
    for (int i = 2; i <= a; i++) {
        nodes.push_back(i);
    }

    vector<int> destroyed;

    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= a; j++) {
            if (i != j) {
                graph[i].push_back(j);
            }
        }
    }

    int count = 0;

    while (b > 0 && !nodes.empty()) {
        int cost = LLONG_MAX;
        int index = 0;

        for (int n : nodes) {
            int temp = 0;
            for (int x : graph[n]) {
                if (find(destroyed.begin(), destroyed.end(), x) == destroyed.end()) {
                    temp += arr[n - 1] * arr[x - 1];
                }
            }

            if (temp < cost) {
                cost = temp;
                index = n;
            }
        }
        nodes.erase(remove(nodes.begin(), nodes.end(), index), nodes.end());

        for (int i = 0; i < destroyed.size(); i++) {
            b += arr[destroyed[i] - 1] * arr[index - 1];
        }
        destroyed.push_back(index);

        b -= cost;
        if (b < 0) {
            break;
        }
        count++;

        for (auto& list : graph) {
            list.erase(remove(list.begin(), list.end(), index), list.end());
        }
    }

    return a - count;
}

int32_t main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t-- > 0) {
        int a, b;
        cin >> a >> b;
        vector<int> arr(a);

        for (int i = 0; i < a; i++) {
            cin >> arr[i];
        }

        cout << fun(arr, a, b) << endl;
    }

    return 0;
}
