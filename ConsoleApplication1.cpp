#include <iostream>
using namespace std;

int main()
{
    cout << "\n\n\n\t\tTEMPERATURE CONVERTER";
    cout << "\n\n\n\t\tBY: IMAM MAHBIR AFRAZ\n\n\t\t";
    system("Pause");
    system("cls");

    while(true)
    {
        double fahrenheit, celcius;
        char option;

        cout << "\n\n\t\t\tYOUR CALCULTORS ARE:" << endl;
        cout << "\n\n\t\t\t1. Celsius to Fahrenheit." << endl;
        cout << "\n\n\t\t\t2. Fahrenheit to Celsius." << endl;
        cin >> option;

        system("cls");


        if (option == '1')
        {
            cout << "\n\n\t\t\tEnter temperature in degree Celsius: ";
            cin >> celcius;

            fahrenheit = (1.8 * celcius) + 32.0;
            cout << "\n\t\t\tTemperature in degree Fahrenheit: " << fahrenheit << " F" << endl;
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y')
            {
                system("Pause");
                system("cls");
                continue;
            }
            else if (choice == 'n')
            {
                break;
            }
            else
            {
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n";
                system("Pause");
                system("cls");
                continue;
            }
        }


        else if (option == '2')
        {
            cout << "\n\n\t\t\tEnter temperature in degree Fahrenheit: ";
            cin >> fahrenheit;

            celcius = (fahrenheit - 32) / 1.8;
            cout << "\n\t\t\tTemperature in degree Celsius: " << celcius << " C" << endl;
            char choice;
            cout << "\n\n\t\t\tDO YOU WANT TO CONTINUE? (y / n) ";
            cin >> choice;
            if (choice == 'y')
            {
                system("Pause");
                system("cls");
                continue;
            }
            else if (choice == 'n')
            {
                break;
            }
            else
            {
                cout << "\n\n\t\t\tInvalid input! Please check.\n\n";
                system("Pause");
                system("cls");
                continue;
            }
        }
        else
        {
            cout << "\n\n\n\t\t\tInvalid Input! please check." << endl; system("Pause");
            system("Pause");
            system("cls");
            continue;
        }

        return 0;
    }
}
