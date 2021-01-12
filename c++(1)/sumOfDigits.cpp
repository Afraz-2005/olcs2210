#include <iostream>
using namespace std;

int main() {
	int t;
	cin >> t;
	
	if(t >= 1 && t <= 1000){

	    for(int i = 0; i < t; i++) {int n ; cin >> n; int sum = 0;

	        for(int j = 0;j < 100; j++) {sum = sum  + n % 10; n = n / 10;}

	         cout << sum << endl;
	    }
	}
	return 0;
}