#include <bits/stdc++.h>
using namespace std;
void f(int n)
{
    static int c=0;
    while(c<n)
        cout << c++ << endl;       
}
int main()
{
    f(5);
    cout << endl;
    f(10);
    return 0;
}