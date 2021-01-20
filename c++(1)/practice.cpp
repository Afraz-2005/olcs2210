
/*Task: "Take an user input and half the value and also half each halfed outputs (eg: input--> 8 output 4 --> 2 --> 1,
continue decreement until its decreasedto the smallest possible number. Ceil the value of a decimal output and
show the original number in a bracket beside it. Use while loop in this task."

sample output:
                 input --> enter a number: 30(input)
                 output --> 30
                            15
                            8(7.5)
                            4
                            2
                            1
*/

//**********************************START OF THE PROGRAM*****************************************

#include <iostream>        //including library for input and output
#include <cmath>           //including library for mathematical operations in c++
using namespace std;       //using namespace std for locating outputs

int main() {               //main function
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << n << endl;
    
    while (n > 1) {                             //while loop
        if (n % 2 == 0) {                       //if statement
            cout << n / 2 << endl;
            n = n / 2;
        }else {                                 //else statement
            double decValue = (double)n / 2;
            n = ceil(decValue);
            cout << n << "(" << decValue << ")" << endl;
        }
    }cout << "\nTask completed :D\n\n";
    return 0;
}
//**********************************END OF THE PROGRAM********************************************
