# include <iostream>
# include <algorithm>
# include <vector>
using namespace std;

int main()
{
    int t;

    cin >> t;

    vector<int> a;
    
    for (int i = 0; i < t; i++) {int z; cin >> z; a.push_back(z);}

    sort(a.begin(), a.end());
     
    for (int i = 0; i < t; i++) cout << endl << a[i] << endl;
    
    return 0;
}