#include <iostream>
using namespace std;

class Queue
{
    private:
        int head;
        int back;
        int a[5];

    public:
        Queue()
        {
            head = -1;
            back = -1;

            for(int i = 0; i < 5; i++)
            {
                a[i] = 0;
            }
        }

        bool isEmpty()
        {
            if(head == -1 && back == -1)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }

        bool isFull()
        {
            if(back == 4)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        void enqueue(int value)
        {
            if(isFull())
            {
                cout << "Queue Full." << endl;
            }
            else if(isEmpty())
            {
                head = 0;
                back = 0;
                a[back] = value;
            }
            else 
            {
                back++;
                a[back] = value;
            }
        }

        int dequeue()
        {
            int temp;

            if(isEmpty())
            {
                cout << "Queue Empty." << endl;
                return 0;
            }
            else if(head == back)
            {
                temp = a[head];
                head = -1;
                back = -1;
                a[head];
                return temp;
            }
            else 
            {
                temp = a[head];
                a[head] = 0;
                head++;
                return temp;
            }
        }

        int count()
        {
            return (back + 1);
        }

        void peek(int position) {
            if(isEmpty()) {
                cout << "Empty Queue." << endl;
            }
            else {
                cout << a[position];
            }
        } 
        void change(int position, int val) {
            if(isEmpty()) {
                cout << "\nNothing to change." << endl;
            }
            else {
                a[position] = val;
            }
        }
        void display() {
            if(isEmpty()) {
                cout << "\nNothing to display." << endl;
            }
            else {
                for(int i = back; i >= 0; i--) {
                    cout << "   " << a[i] << " ";
                }
            }
        }
};