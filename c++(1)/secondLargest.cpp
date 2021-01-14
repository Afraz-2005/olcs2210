# include "iostream"
# include "vector"
using namespace std;

int main() 
{
    int a, b, c, t;
    vector<int> z;

    cin >> t;

    for (int i = 0; i < t; i++)
    {
        cin >> a >> b >> c;

        if (b < a && c > a || c < a && a < b) z.push_back(a);

        else if (a < b && b < c || c < b && b < a) z.push_back(b);

        else if (c > a && b > c || b < c && a > c) z.push_back(c);
    }

    for ( int i = 0; i < t; i++) cout << z[i] << endl;

    return 0;
}