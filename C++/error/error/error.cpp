#include <iostream>
#include <cmath>

using namespace std;

void main()
{
	int y = 0;
	int x= 5 / y;

	for(int i= x; i < 9999999999999999999; i *= 2)
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