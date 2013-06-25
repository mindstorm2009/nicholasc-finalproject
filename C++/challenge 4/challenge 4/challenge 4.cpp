#include <iostream>
#include <cmath>
#include <string>
 
using namespace std;
void cat()
{
	cout << "cat" << endl;
}

int number(int a)
{
	return a;
}

string word(string b, string c)
{
	return b+c;
}

void main()
{
	cat();
	cout << number(2) << endl;
	cout << word("Hello, ", "World")<< endl;
	system("pause");
}




	