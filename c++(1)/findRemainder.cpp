# include <iostream>
# include <vector>
using namespace std;

int main() {
    
    int t, a, b; 
    vector<int> r; 
    cin >> t;

    for (int i = 0; i < t; i++) {cin >> a >> b; r.push_back(a % b) ;}

    for (int i = 0; i < t; i++) cout << endl << r[i] << endl;
}