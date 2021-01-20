#include <iostream>
using namespace std;

int main() {
int t;
cin >> t;
    while(t--)
    {
        int *n;
        n = new int[100000000];
        int num;
        cin >> num;
        int i = 0;
        while( num )
        {
            int rem = num % 10;
            n[i] = rem;
            num = num / 10 ; 
            i++;
        }
        cout << n[0] + n [i - 1] << endl;
    }
	return 0;
}