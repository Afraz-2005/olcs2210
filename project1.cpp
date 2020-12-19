#include <iostream>
using namespace std;

double add(double a, double b)
{
	double answer = a + b;
	return answer;
}
double subtract(double a, double b)
{
	double answer = a - b;
	return answer;
}
double multiply(double a, double b)
{
	double answer = a * b;
	return answer;
}
double divide(double a, double b)
{
	double answer = a / b;
	return answer;
}

int main()
{
	int Num1;
	int Num2;
	char op;
	char choice;

	while (true)
	{
		cout << "\n:::::::::BASIC CALCULATOR::::::::::" << endl << "\n::::::::Operators:|+|-|*|/|::::::::" << endl;
		cout << "\n\tEnter operator: ";
		cin >> op;
		cout << "\tEnter first number: ";
		cin >> Num1;
		cout << "\tEnter second number: ";
		cin >> Num2;
		if (op == '+')
		{
			cout << "\t" << Num1 << " + " << Num2 << " = " << add(Num1, Num2);
			cout << "\n\tDo You Want To Continue? y/n: ";
			cin >> choice;
			if (choice == 'y')
			{
				continue;
			}
			else if (choice == 'n')
			{
				cout << "\n:::::::::END OF PROGRAM::::::::::::\n" << endl;
				break;
			}
			else
			{
				cout << "\n\tInvalid input. Please Check!.\n" << endl;
				continue;
			}
		}
		else if (op == '-')
		{
			cout << "\t" << Num1 << " - " << Num2 << " = " << subtract(Num1, Num2);
			cout << "\n\tDo You Want To Continue? y/n: ";
			cin >> choice;
			if (choice == 'y')
			{
				continue;
			}
			else if (choice == 'n')
			{
				cout << "\n:::::::::END OF PROGRAM::::::::::::\n" << endl;
				break;
			}
			else
			{
				cout << "\n\tInvalid input. Please Check!.\n" << endl;
				continue;
			}
		}
		else if (op == '*')
		{
			cout << "\t" << Num1 << " * " << Num2 << " = " << multiply(Num1, Num2);
			cout << "\n\tDo You Want To Continue? y/n: ";
			cin >> choice;
			if (choice == 'y')
			{
				continue;
			}
			else if (choice == 'n')
			{
				cout << "\n:::::::::END OF PROGRAM::::::::::::\n" << endl;
				break;
			}
			else
			{
				cout << "\n\tInvalid input. Please Check!.\n" << endl;
				continue;
			}
		}
		else if (op == '/')
		{
			cout << "\t" << Num1 << " / " << Num2 << " = " << divide(Num1, Num2);
			cout << "\n\tDo You Want To Continue? y/n: ";
			cin >> choice;
			if (choice == 'y')
			{
				continue;
			}
			else if (choice == 'n')
			{
				cout << "\n:::::::::END OF PROGRAM::::::::::::\n" << endl;
				break;
			}
			else
			{
				cout << "\n\tInvalid input. Please Check!.\n" << endl;
				continue;
			}
		}

	}
	return 0;
}

