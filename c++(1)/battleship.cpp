#include<iostream>
#include <vector>
using namespace std;

int main()
{
	int t;
	char n;
    vector<string> a;
    
    cin >> t;
    
	for (int i = 0; i < t; i++)
	{
        cin >> n;

		if(n == 'B' || n == 'b') a.push_back("BattleShip");

		else if(n == 'C' || n == 'c')  a.push_back("Cruiser");

		else if(n == 'D' || n == 'd') a.push_back("Destroyer");

        else if(n == 'F' || n == 'f') a.push_back("Frigate");
    }

    for (int i = 0; i < a.size(); i++) cout << a[i] << endl;

	return 0;
}