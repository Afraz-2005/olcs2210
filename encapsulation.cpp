/*
Write a class Student with the studentId, studentName and studentHeight as 
private members of the class. Now make an array of 5 student objects in the 
main function and demonstrate the use of all methods. (Use getter and setter methods)
*/

///////////////// START OF PROGRAM ////////////////////

# include <iostream>
# include <string>
using namespace std;

//Using Class Method
class Student
{
//private variables
private:
    string studentId;
    string studentName;
    double studentHeight;
    string School;
    float studentAge;
//Public functions
public:
//Using encapsulation method 
    void setStudentId(string id) {
        studentId = id;
    }

    string getStudentId() {
        return studentId;
    }

    void setStudentName(string name) {
        studentName = name;
    }

    string getStudentName() {
        return studentName;
    }

    double setStudentHeight(int height) {
        studentHeight = height;
    }

    double getStudentHeight() {
        return studentHeight;
    }

    void setSchool(string school) {
        School = school;
    }

    string getSchool() {
        return School;
    }

    int setStudentAge(int age) {
        studentAge = age;
    }

    int getStudentAge() {
        return studentAge;
    }
};
//main function
int main() {

    Student Students[5];
    //Foe loop for repeatation
    for (int i = 0; i < 5; i++)
    {
        cout << "\n\n\n";
        cin.ignore();
        string Id;
        cout << "Enter your Student ID: ";
        getline(cin, Id);

        string name;
        cout << "Enter your full name: ";
        getline(cin, name);

        double height;
        cout << "Enter your height in foot.inch: ";
        cin >> height;

        cin.ignore();
        string school;
        cout << "Enter your school name: ";
        getline(cin, school);

        int age;
        cout << "Enter your age: ";
        cin >> age;

        system("Pause");
        system("cls");
        cout << "ID: " << Id << endl;
        cout << "Name: " << name << endl;
        cout << "Height: " << height << endl;
        cout << "School: " << school << endl;
        cout << "Age: " << age << endl;

        char continuar;
        cout << "do you want to add more student form? y / n: ";
        cin >> continuar;

        //If - Else condition statement
        if (continuar == 'y') {
            continue;
        }
        else if (continuar == 'n') {
            break;
        }

    }


}
//////////////////// END OF PROGRAM ////////////////////