#include <time.h>
#include <stdlib.h>
#include <iostream>


using namespace std;
void main()
{
	srand(time(NULL));
	int a = 2;
	int b = 3;
	int c = 4;
	int d = 5;
	int e = 6;
	int	f = 7;
	int dice = rand() % (a, b, c, d, e, f);
	cout << dice << endl;
	system("pause");
}