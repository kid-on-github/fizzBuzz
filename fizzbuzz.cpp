/*
This is a program that plays Fizz Buzz.
Count to 100; replace numbers devisable by three with the word fizz.
Replace numbers devisable by five with the word buzz.
Numbers divisible by both become fizz buzz.
*/

#include <iostream>
using namespace std;

#include <iostream>

int main() {
    int i=0;
    
    while (i<=100){
        string output;
        (i % 3 == 0) ? output += " fizz" : "";
        (i % 5 == 0) ? output += " buzz" : "";

        cout << i << output << "\n";
        i++;
    }

}