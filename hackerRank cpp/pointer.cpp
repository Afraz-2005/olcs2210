# include "iostream"
using namespace std;

void pointer(int* a, int* b) {
    int v = *a;
    *a = *a + *b;
    *b = v - *b;

    if (*b < 0) *b =- (*b);
}

int main()  {
    int x, y;
    int* ptr = &x;
    int* pn = &y;

    cin >> x >> y;
    pointer(ptr, pn);
    cout << x << endl << y;

    return 0;
}