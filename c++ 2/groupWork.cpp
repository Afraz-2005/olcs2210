#include <iostream>
#include <string>
using namespace std;

void firstCustomer() {
    string c1_name;
    string c1_accNo;
    string c1_nId;
    string c1_phoneNo;
    float c1_balance;

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
    system("Pause");
    system("cls");
    cout << "\n\n\t\tCUSTOMER 1 : \n\n";
    cout << "\n\n\t\t\tName:-" << c1_name << endl;
    cout << "\n\n\t\t\tAccount number:-" << c1_accNo << endl;
    cout << "\n\n\t\t\tNID:-" << c1_nId;
    cout << "\n\n\t\t\tPhone number:-" << c1_phoneNo << endl;
    cout << "\n\n\t\t\tBalance:-" << c1_balance << endl << endl << endl;

}


void secondCustomer() {
    string c2_name;
    string c2_accNo;
    string c2_nId;
    string c2_phoneNo;
    float c2_balance;

    cout << "\n\n\t\t\tEnter your name: ";
    cin >> c2_name;
    cout << "\n\n\t\t\tEnter your Account number: ";
    cin >> c2_accNo;
    cout << "\n\n\t\t\tEnter your National Id number: ";
    cin >> c2_nId;
    cout << "\n\n\t\t\tEnter your phonr number: ";
    cin >> c2_phoneNo;
    cout << "\n\n\t\t\tEnter the balance in your account:";
    cin >> c2_balance;
    cout << "\n\n\t\t\t";
    system("Pause");
    system("cls");
    cout << "\n\n\t\tCUSTOMER 2 : \n\n";
    cout << "\n\n\t\t\tName:-" << c2_name << endl;
    cout << "\n\n\t\t\tAccount number:-" << c2_accNo << endl;
    cout << "\n\n\t\t\tNID:-" << c2_nId << endl;
    cout << "\n\n\t\t\tPhone number:-" << c2_phoneNo << endl;
    cout << "\n\n\t\t\tBalance:-" << c2_balance << endl << endl << endl;
}

void menu() {
    cout << "\n\n\t\t1.MAIN MENU :- \n\n";
    cout << "\n\n\t\t\t2.ADD ACCOUNT\n";
    cout << "\n\n\t\t\t3.VIEW ACCOUNTS\n";
    cout << "\n\n\t\t\t4.EXIT\n\n"
}


int main() {
    cout << "\n\n\t\t\tBANKING MANAGEMENT SYSTEM\n\n\t\t\t~~~~~~GROUP WORK~~~~~~\n\n\t\t\t";
    system("Pause");
    system("cls");
    menu();
    char choose;
    cin << choose;
    if (choose == '1') {
        cout << "\n\n\t\tADD ACCOUNT:-\n\n\t\t\t(a)Customer 1 \n\t\t\t (b)Customer 2\n\n\t\t\tChoice: ";
        cin >> choose;
        system("cls");

        if (choose == 'a') {
            firstCustomer();
        }
        else if (choose == 'b') {
            secondCustomer();
        }
    }

    return 0;
}