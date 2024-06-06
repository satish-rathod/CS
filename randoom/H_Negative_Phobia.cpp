#include <bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int k=0;
        int arr[n];
        for(int i = 0; i < n; i++)
            cin >> arr[i];
        int ans = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end < n && start < n){
            while(sum >= k && start < end){
                sum = sum - arr[start];
                start++;
            }
            if(end >= start)
                ans = ans + end - start;
            sum += arr[end];
            end++;
        }
        cout << n*(n+1)/2 - ans << "\n";
    }
    return 0;
}