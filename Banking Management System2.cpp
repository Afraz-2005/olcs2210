#include <iostream>
using namespace std;

string c1_name, c1_accNo, c1_nId, c1_phoneNo, c1_balance;
string c2_name, c2_accNo, c2_nId, c2_phoneNo, c2_balance;

void customer_1() {
    cout << "\n\n\t\t\tEnter your name: ";
    cin >> c1_name;
    cout << "\n\n\t\t\tEnter your Account number: ";
    cin >> c1_accNo;
    cout << "\n\n\t\t\tEnter your National Id number: ";
    cin >> c1_nId;
    cout << "\n\n\t\t\tEnter your phone number: ";
    cin >> c1_phoneNo;
    cout << "\n\n\t\t\tEnter your current balance in your account: ";
    cin >> c1_balance;
    cout << "\n\n\t\t\t";
}

void data_1() {
    cout << "\n\n\t\tCUSTOMER 1 : \n\n";
    cout << "\n\n\t\t\tName:- " << c1_name << endl;
    cout << "\n\n\t\t\tAccount number:- " << c1_accNo << endl;
    cout << "\n\n\t\t\tNID:- " << c1_nId;
    cout << "\n\n\t\t\tPhone number:- " << c1_phoneNo << endl;
    cout << "\n\n\t\t\tBalance:- " << c1_balance << endl << endl << endl;
}

void customer_2() {
    cout << "\n\n\t\t\tEnter your name: ";
    cin >> c2_name;
    cout << "\n\n\t\t\tEnter your Account number: ";
    cin >> c2_accNo;
    cout << "\n\n\t\t\tEnter your National Id number: ";
    cin >> c2_nId;
    cout << "\n\n\t\t\tEnter your phone number: ";
    cin >> c2_phoneNo;
    cout << "\n\n\t\t\tEnter your current balance in your account: ";
    cin >> c2_balance;
    cout << "\n\n\t\t\t";

}

void data_2() {
    cout << "\n\n\t\tCUSTOMER 2 : \n\n";
    cout << "\n\n\t\t\tName:- " << c2_name << endl;
    cout << "\n\n\t\t\tAccount number:- " << c2_accNo << endl;
    cout << "\n\n\t\t\tNID:- " << c2_nId;
    cout << "\n\n\t\t\tPhone number:- " << c2_phoneNo << endl;
    cout << "\n\n\t\t\tBalance:- " << c2_balance << endl << endl << endl;
}

void menu() {

    while (true)
    {
        char selection;
        cout << "\n\n\t\t\tMAIN MENU :- \n\n";
        cout << "\n\n\t\t\t1.ADD ACCOUNT\n";
        cout << "\n\n\t\t\t2.VIEW ACCOUNTS\n";
        cout << "\n\n\t\t\t3.WITHDRAW ACCOUNT\n";
        cout << "\n\n\t\t\t4.EXIT\n\n\t\t";
        cout << "\n\n\n\t\t\tSELECT: ";
        cin >> selection;

        system("cls");
        if (selection == '1') {
            char custom_1;
            cout << "\n\n\t\tADD ACCOUNT:-\n\n\t\t\t(a)Customer 1\n\n\t\t\t(b)Customer 2\n\n\t\t\tChoice: ";
            cin >> custom_1;
            system("cls");
            if (custom_1 == 'a') {
                customer_1();
                system("Pause");
                system("cls");
                continue;
            }
            else if (custom_1 == 'b') {
                customer_2();
                system("Pause");
                system("cls");
                continue;
            }
            else {
                cout << "\n\n\t\t\tINVALID INPUT! PLEASE CHECK.\n\n";
                continue;
            }
        }
        else if (selection == '2') {
            char custom_2;
            cout << "\n\n\t\tVIEW ACCOUNTS:- \n\n\t\t\t(a)customer 1 \n\n\t\t\t(b)Customer 2\n\n\t\t\tChoice: ";
            cin >> custom_2;
            system("cls");
            if (custom_2 == 'a') {
                data_1();
                system("Pause");
                system("cls");
                continue;
            }
            else if (custom_2 == 'b') {
                data_2();
                system("Pause");
                system("cls");
                continue;
            }
            else {
                cout << "\n\n\t\t\tINVALID INPUT! PLEASE CHECK.\n\n";
                continue;
            }
        }
        else if (selection == '4') {
            cout << "\n\n\n\n\t\t\tTHANK YOU FOR USING ! \n\n\n\n";
            break;
        }
        else if (selection == '3') {
            char withdrawAcc;
            cout << "\n\n\t\tACCOUNTS:- \n\n\n\t\t\t(a)Customer 1\n\n\n\t\t\t(b)Customer 2\n\n\n\t\t\twhich account do you want to with draw? ";
            cin >> withdrawAcc;
            if (withdrawAcc == 'a') {
                
            }
        }
    }
}

int main()
{
    cout << "\n\n\t\t\tBANKING MANAGEMENT SYSTEM\n\n\t\t\t~~~~~~GROUP WORK~~~~~~\n\n\t\t\t";
    system("Pause");
    system("cls");
    menu();

}


