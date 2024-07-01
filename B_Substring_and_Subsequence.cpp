#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;
    
    while (t--) {
        string a, b;
        cin >> a >> b;
        
        int arr1[26] = {0};
        int arr2[26] = {0};
        
        for (char ch : a) {
            arr1[ch - 'a']++;
        }
        
        for (char ch : b) {
            arr2[ch - 'a']++;
        }
        
        int extraCharsNeeded = 0;
        
        for (int i = 0; i < 26; i++) {
            if (arr2[i] > arr1[i]) {
                extraCharsNeeded += arr2[i] - arr1[i];
            }
        }
        
        cout << a.size() + extraCharsNeeded << endl;
    }
    
    return 0;
}
