# include "iostream"
using namespace std;

int main() {
   int a,b;

    cin >> a;
    cin >> b;

    string num[10] = {" ","one","two","three","four","five","six","seven","eight","nine"};
    
    for(int i = a; i <= b; i++) {

        if(i > 0 && i <= 9) cout << num[i] << endl;

        else if(i % 2 == 0) cout << "even" <<endl; 

        else cout << "odd" << endl;
    }
    return 0;
}