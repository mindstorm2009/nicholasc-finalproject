#include <iostream>
#include <cmath>

using namespace std;

void main ()
{
	int i;
	cin >> i;
	while ( i> 10)
	{
		cout << "Please enter a number less than 10" << endl;
		cin >> i
	}
	for(; i < 10; i++)
	{
		cout << i << endl;
	}
	for(int i= 1; i < 1000000; i *=2)
	{
		if(i < 4)
		{
			i+= 3;
			continue;
		}

		cout << i << endl;
	}
	system("pause");
}