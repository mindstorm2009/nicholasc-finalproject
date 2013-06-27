#include <iostream>
#include <cmath>

using namespace std;

void main()
{
	int *arr = new int[5];
	arr = new int [5];
	for(;;)
	{
		arr = new int[50];
		cout << arr << endl;
	}
	system("pause");
}