#include <iostream>
#include <cmath>
#include <string>
#include "Dog.h"

using namespace std;

void main()
{
	string askplay;
	bool isPlaying = true;
	cout << "Welcome to Dog Simulator" << endl;
	cout << "Do want to play or exit? (y/n): ";
	cin >> askplay;

	if(askplay == "y")
	{
		isPlaying = true;
	}
	else
	{
		isPlaying = false;
	}

	if(isPlaying)
	{
		string pupname;
		cout << "You recieve a puppy.  Please name the puppy"<< endl;
		cin >> pupname;
		Dog* pup = new Dog();
		pup->age = .083;
		pup->energyLevel = 10;
		pup->happiness =100;
		pup->weight = 10;
		pup->hunger = 100;

	}
}