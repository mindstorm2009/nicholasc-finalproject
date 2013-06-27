#include <iostream>
#include <cmath>


using namespace std;
int x = 5;

void main()
{
	int *arr = new int[5];
	arr = new int [5];
	for(;;)
	{
		arr = new int[50];
		delete[] arr;
	}
	system("pause");
}