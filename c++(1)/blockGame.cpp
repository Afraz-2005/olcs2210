#include <iostream>
using namespace std;

int main() {

    int t, n, t, r;
    cin >> t;
    
    while(t--)
    {
        cin >> n; 
        
        t = n;
        
        r = 0;

        while (n != 0)
        {
            int e = n % 10;
            r = r * 10 + e;
            n = n / 10;
        }
        
        if(t == r) { 

            cout << "wins" <<endl;
        }

        else cout<< "loses" << endl;
    }
    
	return 0;
}