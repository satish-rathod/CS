#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void computeProfit() {
    long long numOfItems, unitsPerTransaction, maxTransactions, totalProfit = 0;
    cin >> numOfItems >> unitsPerTransaction >> maxTransactions;
    
    vector<long long> prices(numOfItems);
    for (long long i = 0; i < numOfItems; ++i)
        cin >> prices[i];
    
    sort(prices.begin(), prices.end());
    
    for (long long i = 0; i < numOfItems; ++i) {
        if (maxTransactions >= unitsPerTransaction) {
            totalProfit += (i * unitsPerTransaction + prices[i]) * unitsPerTransaction;
            maxTransactions -= unitsPerTransaction;
        } else {
            totalProfit += (i * unitsPerTransaction + prices[i]) * maxTransactions;
            break;
        }
    }
    
    cout << totalProfit << endl;
}

int main() {
    long long testCases;
    cin >> testCases;
    while (testCases--)
    {
        computeProfit();
    }
    return 0;
}
