#include <iostream>
using namespace std;

int max_of_four(int a,int b,int c, int d){
   
    if(a > b) {
        if (a > c) {
            if(a > d) return a; else return d;
        }
        else {
            if (c > d) return c; else return d;
        }
    }
    else {
        if (b > c) {
            if (b > d) return b; else return d;
        }
        else {
            if (c > d) return c; else return d;
        }
    }
}  
int main() {
    int w, x, y, z;
    cin >> w >> x >> y >> z;

    cout << max_of_four (w, x, y, z);
    return 0;
}