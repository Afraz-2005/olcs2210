#include<iostream>
using namespace std;

int main()
{
    int x = 0;
    int y = 1;
    int z = 1;

    cout << endl << x << endl << y << endl;
    while (x + y < 40){
        z = x + y;
        x = y;
        y = z;
        cout << z << endl;
    }
    cout << endl;

    return 0;
}