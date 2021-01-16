# include "iostream"
# include "vector"
# include "algorithm"

using namespace std;

int main() {

    int t;
    cin >> t;

    int arr[t];

    for (int i = 0; i < t; i++) cin >> arr[i];
    for (int i = t - 1; i >= 0; i--) cout << arr[i] << " ";
    return 0;

}