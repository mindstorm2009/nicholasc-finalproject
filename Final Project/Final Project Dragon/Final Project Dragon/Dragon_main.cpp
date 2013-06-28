#include <iostream>
#include <cmath>
#include <string>
#include "Dog.h"

using namespace std;

void main()
{
	string askplay;
	bool isPlaying = true;
	cout << "|=====================================================|" << endl;
	cout << "|          Welcome to Tamagachi: PC Version	      |" << endl;
	cout << "|                     Credits:			      |" << endl;
	cout << "|              Creator: Nicholas Curl		      |" << endl;
	cout << "|Code Help: My ID Programing Academy Instructor Dragon|" << endl;
	cout << "|=====================================================|" << endl << endl;
	cout << "Do want to play or exit? (y/n): ";
	cin >> askplay;

	isPlaying = (askplay == "y");

	if(!isPlaying)
	{
		return;
	}

	string pupname;
	system("CLS");
	cout << "You recieve a puppy.  Please name the puppy"<< endl;
	cin >> pupname;

	Dog* pup = new Dog();
	pup->age = .083;
	pup->energyLevel = 10;
	pup->happiness =100;
	pup->weight = 10;
	pup->hunger = 100;
	pup->name = pupname;

	do
	{
		int selection;
		cout << "1. Check on "<< pup->name << endl;
		cout << "2. Interact with " << pup->name << endl;
		cout << "3. Quit"<< endl;
		cout << "Please make a selection (1,2, or 3): ";
		cin >> selection;
		
		switch(selection)
		{
		case 1:
			//print out pup stuff
			break;
		case 2:
			//interaction stuff
			break;
		case 3:
			isPlaying = false;
		}
	}while(isPlaying);

}
