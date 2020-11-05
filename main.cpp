#include <iostream>
using namespace std;

int main() {

	cout << "::::::::::BASIC CALCULATOR::::::::::" << endl;
	cout << "    | OPERATORS :  + | - | * | / |";

	char op;
	cout << "\n    Enter your operator : ";
	cin >> op;
	int num1;
	cout << "\n    Enter First Number : ";
	cin >> num1;
	int num2;
	cout << "\n    Enter Second Number : ";
	cin >> num2;
	double answer;
	char choice;

	switch (op)
	{

	case '+':
		answer = num1 + num2;
		cout << "\n    " << num1 << " + " << num2 << " = " << answer << endl;
		cout << "\n:::::::::END OF OPERATION:::::::::" << endl;
		cout << "" << endl;
		break;


	case '-':
		answer = num1 - num2;
		cout << "\n    " << num1 << " + " << num2 << " = " << answer << endl;
		cout << "\n:::::::::END OF OPERATION:::::::::" << endl;
		cout << "" << endl;
		break;

	case '*':
		answer = num1 * num2;
		cout << "\n    " << num1 << " + " << num2 << " = " << answer << endl;
		cout << "\n:::::::::END OF OPERATION:::::::::" << endl;
		cout << "" << endl;
		break;

	case '/':
		answer = num1 / num2;
		cout << "\n    " << num1 << " + " << num2 << " = " << answer << endl;
		cout << "\n:::::::::END OF OPERATION:::::::::" << endl;
		cout << "" << endl;
		break;

	default:
		cout << "\n    Invalid Input, please check." << endl;
		cout << "\n:::::::::END OF OPERATION:::::::::" << endl;
		cout << "" << endl;
		break;
	}

	
}