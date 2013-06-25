#include <iostream>
#include <cmath>

using namespace std;

void main()
{
	cout << "Welcome to the Code Calculator" << endl;
	double x,y;
	char op;
	cin >> x;
	cin >> y;
	cin >> op;

	if(op=='+')
	{
		cout<< "The answer is " << x+y << endl;
	}
	else if(op=='-')
	{
		cout << "The answer is " << x-y<< endl;
	}
	else if(op=='*')
	{
		cout << "The answer is "<< x*y << endl;
	}
	else if(op== '^')
	{
		cout << "The answer is " << pow(x,y) << endl;
	}
	else
	{
		cout << "The answer is " << x/y << endl;
	}
	system("pause");
}