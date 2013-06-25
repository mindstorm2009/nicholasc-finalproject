#include <iostream>
#include <cmath>

using namespace std;

void main()
{
	for(int i= 1; i < 9999999999999999999; i *= 2)
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