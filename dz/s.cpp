#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main(){

    stack<int> s;
    for(int i = 0 ; i < 5; i ++){
        s.push(i);
        cout << i << endl;
    }

    return 0;
}