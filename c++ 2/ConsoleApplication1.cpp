#include <iostream>                                             //Including library for input and output
#include <cmath>                                                //Including library for C++ mathematics

using namespace std;

double celcius(double f) {                                           //Function for calculting degree celcius
    double celcius = (f - 32) / 1.8;
    return celcius;
}
double fahrenheit(int c) {                                          //Fuction for calculating degree fahrenheit
    double fahrenheit = (1.8 * c) + 32.0;
    return fahrenheit;
}
double squared(int num1) {                                         //Function for calculating square
    double square = num1 * num1;
    return square;
}
double squaredRoot(int num1) {                                    //Function for calculating square root
    double sqr = sqrt(num1);
    return sqr;
}
double cube(int num1) {                                           //Function for calculating cube
    double cube = num1 * num1 * num1;                   
    return cube;
}
double cubeRoot(int num1) {                                      //Function for calculating cube root
    double cbr = cbrt(num1);
    return cbr;
}
double basicCalcultor(double num1, double num2) {
    double result = num1 + num2;
    return result;
}

int main(){                                                        //Executing main function
    cout << "\n\n\n\t\tTEMPERATURE CONVERTER";
    cout << "\n\n\n\t\tBY: IMAM MAHBIR AFRAZ\n\n\t\t";
    system("Pause");
    system("cls");

    while(true){                                                  //While loop for recurring program
        char option;
        cout << "\n\n\t\t\tYOUR CALCULTORS ARE:" << endl;
        cout << "\n\n\t\t\t1. Celsius to Fahrenheit." << endl;
        cout << "\n\n\t\t\t2. Fahrenheit to Celsius." << endl;
        cout << "\n\n\t\t\t3. Find the square of a number." << endl;
        cout << "\n\n\t\t\t4. Find the square root of a number." << endl;
        cout << "\n\n\t\t\t5. Find the cube of a number." << endl;
        cout << "\n\n\t\t\t6. Find the cube root of a number." << endl;
        cin >> option;
        system("cls");
        if (option == '1'){                                       //IF ELSe (condition) statement
            int cel;
            cout << "\n\n\t\t\tEnter temperature in degree Celsius: ";
            cin >> cel;
            cout << "\n\t\t\tTemperature in degree Fahrenheit: " << fahrenheit(cel) << " F" << endl;
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y'){                                 //IF (condition) statement for continuation
                system("cls");
                continue;
            }else if (choice == 'n'){                             //ELSE IF (condition)e statement for continuation
                break;
            }else{
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n\t\t\t";   //ELSE (condition) statement for continuation
                system("Pause");
                system("cls");
                continue;
            }
        }else if (option == '2') {                               //ELSE IF (condition) statement
            system("cls");
            int fah;
            cout << "\n\n\t\t\tEnter temperature in degree Fahrenheit: ";
            cin >> fah;
            cout << "\n\t\t\tTemperature in degree Celsius: " << celcius(fah) << " C" << endl;
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y') {                               //IF (condition) statement for continuation
                system("cls");
                continue;
            }
            else if (choice == 'n') {                         //ELSE IF (condition) statement for continuation
                break;
            }
            else {
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n";   //ELSE (condition) statement for continuation
                system("Pause");
                system("cls");
                continue;
            }
        }
        else if (option == '3') {                              //ELSE IF (condition) statement
            system("cls");
            int square;
            cout << "\n\n\t\t\tEnter number to be squared: ";
            cin >> square;
            cout << "\n\n\t\t\t" << square << " squared is: " << squared(square);
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y') {                               //IF (condition) statement for continuation
                system("cls");
                continue;
            }
            else if (choice == 'n') {                         //ELSE IF (condition) statement for continuation
                break;
            }
            else {
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n";   //ELSE (condition) statement for continuation
                system("Pause");
                system("cls");
                continue;
            }

        }
        else if (option == '4') {                                //ELSE IF (condition) statement
            system("cls");
            int sqRoot;
            cout << "\n\n\t\t\tEnter number to be squared root: ";
            cin >> sqRoot;
            cout << "\n\n\t\t\t" << sqRoot << " squared root is: " << squaredRoot(sqRoot);
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y') {                               //IF (condition) statement for continuation
                system("cls");
                continue;
            }
            else if (choice == 'n') {                         //ELSE IF (condition) statement for continuation
                break;
            }
            else {
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n";   //ELSE (condition) statement for continuation
                system("Pause");
                system("cls");
                continue;
            }
        }
        else if (option == '5') {                             //ELSE IF (condition) statement
            system("cls");
            int cb;
            cout << "\n\n\t\t\tEnter number to be cubed: ";
            cin >> cb;
            cout << "\n\n\t\t\t" << cb << " cubed is: " << cube(cb);
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y') {                               //IF (condition) statement for continuation
                system("cls");
                continue;
            }
            else if (choice == 'n') {                         //ELSE IF (condition) statement for continuation
                break;
            }
            else {
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n";   //ELSE (condition) statement for continuation
                system("Pause");
                system("cls");
                continue;
            }
        }
        else if (option == '6') {                               //ELSE IF (condition) statement
        system("cls");
        int cbRoot;
        cout << "\n\n\t\t\tEnter number to be cubed root: ";
        cin >> cbRoot;
        cout << "\n\n\t\t\t" << cbRoot << " cubed root is: " << cubeRoot(cbRoot);
        char choice;
        cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
        cin >> choice;
        if (choice == 'y') {                               //IF (condition) statement for continuation
            system("cls");
            continue;
        }
        else if (choice == 'n') {                         //ELSE IF (condition) statement for continuation
            break;
        }
        else {
            cout << "\n\n\t\t\tInvalid input! Please check.\n\n";   //ELSE (condition) statement for continuation
            system("Pause");
            system("cls");
            continue;
        }
        }
        else{                                                 //ELSE (condition) statement
            cout << "\n\n\n\t\t\tInvalid Input! please check." << endl; system("Pause");
            system("Pause");
            system("cls");
            continue;
        }
        return 0;
    }
}
