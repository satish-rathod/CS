#include <iostream>
#include <vector>
#include <algorithm>
#include <map>

using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef pair<int, int> pii;

void solve()
{
    int n;
    cin >> n;

    vi originalArray(n), sortedArray(n);
    for (int i = 0; i < n; i++)
    {
        cin >> originalArray[i];
        sortedArray[i] = originalArray[i];
    }

    sort(sortedArray.begin(), sortedArray.end());

    map<int, int> indexMap;
    ll sum = 0;
    int i = 0, j = 1;

    while (i < n)
    {
        if (i < j)
            sum += sortedArray[i];

        if (i + 1 < n && sum >= sortedArray[i + 1])
        {
            while (j < n && sum >= sortedArray[j])
            {
                sum += sortedArray[j];
                j++;
            }

            indexMap[sortedArray[i]] = j - 1;
            i++;
        }
        else
        {
            indexMap[sortedArray[i]] = i;
            i++;
            j = i + 1;
        }
    }

    for (int i = 0; i < n; i++)
    {
        cout << indexMap[originalArray[i]] << " ";
    }

    cout << endl;
}

main()
{
    cin.tie(nullptr)->sync_with_stdio(false);

    int t;
    cin >> t;

    while (t--)
    {
        solve();
    }

    return 0;
}
