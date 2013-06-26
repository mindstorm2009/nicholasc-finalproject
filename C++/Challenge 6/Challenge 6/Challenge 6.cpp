#include <iostream>
#include <cmath>

using namespace std;

void main()
{
	int size;
	cout << "What is the size of the array?" << endl;
	cin >> size;
	int* arr = new int[size];
	for(int i = 0; i < size; i++)
	{	
		cout << "Input the values for the array." << endl;
		cin >>  arr[i];
	}
	for(int i = 0; i < size; i++)
	{
		cout << endl << endl << *(arr+i) << " " << endl;
	}
	system("pause");
}
