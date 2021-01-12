#include<iostream>
using namespace std;

int main() {
	int n, factor = 1, i;
	cout << "Enter a number: ";
	cin >> n;
	cout << n <<"! = ";
	cout << n;
	for (i = n - 1 ; i > 0; --i) {
		n = n * i ;
		cout << " * " << i ;
	}
	cout << " = " << n;
	return 0;
}
