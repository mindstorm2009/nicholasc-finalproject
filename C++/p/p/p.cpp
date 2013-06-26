#include <iostream>
#include <cmath>

using namespace std;

void p()
{
	cout<< "hi!" << endl;
	p();
}

void main()
{
	p();
}