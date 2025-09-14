#include <iostream>
#include <string>
#include <list>

using namespace std;

int main(){

    list<int> l;
    for(int i = 0 ; i < 5; i ++){
        l.push_back(i);
        cout << i << endl;
    }

    return 0;
}
