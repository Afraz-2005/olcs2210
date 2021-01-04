#include <iostream>
using namespace std;

class Main
{
private:
    string bookName, author, isbn, year;
    int aCopies;

public:
    Main(string bn, string at, string ibn, int aC, string y){
        bookName = bn;
        author = at;
        isbn = ibn;
        aCopies = aC;
        year = y; 
    }
    void info(){
        cout << "Book name: " << endl;
        cout << "Author: " << endl;
        cout << "ISBN no.: " << endl;
        cout << "available copies: " << endl;
        cout << "year: " << endl;
    }
};

int main(){
    Main book1("Kite Runner", "Khaled Hosseini", "12323-263665-75", 4, "2005");
    book1.info();
    
    Main book2("NARNIA: Prince Caspian", "C.S Lewis", "32324-11085-454", 3, "1950");
    book2.info();

    Main book3("Diary Of A Wimpy kid: Meltdown", "Jeff Kinny", "234442-1009-56-99", 5, "2019");
    book3.info();

    Main book4("A Thousand Splendid Suns", "Khaled Hosseini", "757-6666-7575-3", 2, "2007");
    book4.info();

    return 0;
}