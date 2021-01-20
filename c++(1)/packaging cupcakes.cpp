#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int t, a, n;
    vector<int> x;

    cin >> t;

    for (int i = 0; i < t; i++)
    {
        cin >> a;

        cin >> n;

        x.push_back(a - n);
    }

    for (int i = 0; i < x.size(); i++) cout << x[i] << endl;

    return 0;
}