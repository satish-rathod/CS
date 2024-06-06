#include <iostream>
#include <vector>
#include <algorithm>
#define vi vector<int>
#define all(x) x.begin(), x.end()
#define endl '\n'



using namespace std;

void solve(){
    int n,k,h=0,l=0;cin>>n>>k;
    vi a(n);cin>>a;
    int num=a[k-1];
    int Max= *max_element(all(a));
    bool g=0;
    if(num==Max){cout<<n-1<<endl;return;}
    for(int i=0; i<n; i++){
        if(!g){
            if(a[i]>num){
                h=i;g=1;
                if(i+1>k){cout<<i-1<<endl;return;}
            }
        }
        else{
            if(a[i]>=num){
                l=i-h;
                if(h==0) l--;
                cout<<max(h-1,l)<<endl;
                return;
            }
        }
    }
}

int main() {
    int testCases;
    cin >> testCases;
    while (testCases--)
    {
        solve();
    }
    return 0;
}
