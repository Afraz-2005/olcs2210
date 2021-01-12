# include <iostream>
# include <vector>
using namespace std;

int main()
{
    vector<int> r;
    int num, factorial = 1, t;
    cin >> t;

	for (int i = 1; i < t; i++) {

        cin >> num;
        r.push_back(factorial = factorial * i);
	}

    for (int i = num - 1; i < t; i++)
    {
        cout << endl << r[i] << endl;
    }
    
}
// #include<iostream>
// using namespace std;

// int main() {
// 	int n, factor = 1, i;
// 	cout << "Enter a number: ";
// 	cin >> n;
// 	cout << n <<"! = ";
// 	cout << n;
// 	for (i = n - 1 ; i > 0; --i) {
// 		n = n * i ;
// 		cout << " * " << i ;
// 	}
// 	cout << " = " << n;
// 	return 0;
// }

// # include <iostream>
// # include <vector>
// using namespace std;

// int main() {
    
//     int t, a, b; 
//     vector<int> r; 
//     cin >> t;

//     for (int i = 0; i < t; i++) {cin >> a >> b; r.push_back(a % b) ;}

//     for (int i = 0; i < t; i++) cout << endl << r[i] << endl;
// }