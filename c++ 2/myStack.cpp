# include <iostream>
# include <stack>
using namespace std;

class My_Stack_Holder {
    public:
        void stack_exe_function(stack<int> stack_variable) {
            while (!stack_variable.empty()) { 
                cout << " " << stack_variable.top(); 
                stack_variable.pop(); 
            } 
            cout << '\n'; 
        }
};
int main() {
    My_Stack_Holder My_StackObject;
    int insert_stack;
    stack<int> stackMain_holder;
    stackMain_holder.push(10);
    stackMain_holder.push(30);
    stackMain_holder.push(20);
    stackMain_holder.push(5);
    stackMain_holder.push(1);

    cout << "STACK: ";
    My_StackObject.stack_exe_function(stackMain_holder);

    cout << "\nSTACK_SIZE: " << stackMain_holder.size() << endl;
    cout << "TOP_STACK: " << stackMain_holder.top() << endl;
    cout << "STACK_POP: ";
    stackMain_holder.pop();
    My_StackObject.stack_exe_function(stackMain_holder);
    cout << "\nSTACK_CHANGE: ";
    stackMain_holder.push(24);
    My_StackObject.stack_exe_function(stackMain_holder);

    return 0;
}