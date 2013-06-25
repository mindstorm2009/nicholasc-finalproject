#include <iostream>
#include <cmath>

using namespace std;

void main()
{
	int cats[3], dogs[2];
	char name[] = { 'B', 'o', 'b'};
	cout << "How old are your 3 cats?" <<endl;
	for(int i = 0; i < 3; i++)
	{
		cin >> cats[i];
		cout << endl;
	}
	for(int i = 0; i < 3; i++) 
	{
		cout << cats[i] << " ";
	}
	system("pause");
}