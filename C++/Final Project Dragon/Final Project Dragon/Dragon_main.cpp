#include <iostream>
#include <cmath>
#include <string>
#include "Dog.h"

using namespace std;

void examineDog(Dog &pup)
{
	cout << endl << pup.getName() << endl;
	cout << pup.getAge() << " years old" << endl;
	cout << pup.getEnergy() << " energy" << endl;
	cout << pup.getHappiness() << " happiness" << endl;
	cout << pup.getHunger() << " hunger" << endl;
	cout << pup.getWeight() << " lbs." << endl << endl;
}

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
	cout << endl;

	Dog* pup = new Dog();
	pup->setAge(.083);
	pup->setEnergy(10);
	pup->setHappiness(100);
	pup->setWeight(10);
	pup->setHunger(100);
	pup->setName(pupname);

	do
	{
		int selection;

		if(pup->getEnergy() < 15)
		{
			cout << "Bark, Bark, Bark" << endl;
			cout << pup->getName() << " is tired please put " << pup->getName() << " in bed" << endl << endl;
		}

		if(pup->getHunger() < 15)
		{
			cout << "Bark, Bark, Bark" << endl;
			cout << pup->getName() << " is tired hungry please feed " << pup->getName() << endl << endl;
		}

		if(pup->getHappiness() < 15)
		{
			cout << "Bark, Bark, Bark" << endl;
			cout << pup->getName() << " is lonely please play with " << pup->getName() << endl << endl;
		}

		cout <<"1. Check on "<< pup->getName() << endl;
		cout << "2. Interact with " << pup->getName() << endl;
		cout << "3. Clear Screen" << endl;
		cout << "4. Quit"<< endl;
		cout << "Please make a selection (1, 2, 3, or 4): ";
		cin >> selection;
		cout << endl;

		switch(selection)
		{
		case 1:
			examineDog(*pup);
			break;
		case 2:
			int interaction;
			cout << "1. Play with " << pup->getName() << endl;
			cout << "2. Make " << pup->getName() << " sleep" << endl;
			cout << "3. Feed " << pup->getName() << endl;
			cout << "4. Command " << pup->getName() << " to sit" << endl;
			cout << "5. Command " << pup->getName() << " to lie down" << endl;
			cout << "6. Quit" << endl;
			cout << "Please make a selection (1, 2, 3, 4, 5, or 6): ";
			cin >> interaction;
			cout << endl;

			switch(interaction)
			{
			case 1:
				int play;
				cout << "1. Use a fisbee" << endl;
				cout << "2. Use a ball" << endl;
				cout << "3. Play tug of war with " << pup->getName() << endl;
				cout << "4. Throw a bone" << endl;
				cout << "5. Belly rub" << endl;
				cout << "Please make a selection (1, 2, 3, 4, or 5): ";
				cin >> play;
				cout << endl;

				switch(play)
				{
				case 1:
					cout << "You throw a frisbe so " << pup->getName() << " can fetch" << endl << endl;
					pup->setEnergy(pup->getEnergy()-0.5);
					pup->setHunger(pup->getHunger()-0.5);
					pup->setHappiness(pup->getHappiness()+2.5);
					pup->setWeight(pup->getWeight()-0.002);
					break;
				case 2:
					cout << "You throw a ball so " << pup->getName() << " can fetch" << endl << endl;
					pup->setEnergy(pup->getEnergy()-0.5);
					pup->setHunger(pup->getHunger()-0.5);
					pup->setHappiness(pup->getHappiness()+2.5);
					pup->setWeight(pup->getWeight()-0.002);
					break;
				case 3:
					cout << "You pull on one side of the rope and " << pup->getName() << " is pulling on the other" << endl << endl;
					pup->setEnergy(pup->getEnergy()-1.5);
					pup->setHunger(pup->getHunger()-1);
					pup->setHappiness(pup->getHappiness()+3.5);
					pup->setWeight(pup->getWeight()-0.002);
					break;
				case 4:
					cout << "You throw a bone so " << pup->getName() << " can fetch" << endl << endl;
					pup->setEnergy(pup->getEnergy()-0.5);
					pup->setHunger(pup->getHunger()-0.5);
					pup->setHappiness(pup->getHappiness()+2.5);
					pup->setWeight(pup->getWeight()-0.002);
					break;
				case 5:
					cout << "You give " << pup->getName() << " a good belly rub" << endl << endl;
					pup->setHunger(pup->getHunger()-0.5);
					pup->setHappiness(pup->getHappiness()+5);
					pup->setWeight(pup->getWeight()-0.002);
					break;
				}
				break;
			case 2:
				cout << pup->getName() << " is sleeping" << endl << endl;
				pup->setEnergy(pup->getEnergy()+100);
				pup->setHunger(pup->getHunger()-0.5);
				pup->setWeight(pup->getWeight()-.002);
				pup->setHappiness(pup->getHappiness()-1);
				break;
			case 3:
				cout << pup->getName() << " is eating" << endl << endl;
				pup->setEnergy(pup->getEnergy()+1);
				pup->setHunger(pup->getHunger()+100);
				pup->setHappiness(pup->getHappiness()+3);
				pup->setWeight(pup->getWeight()+1);
				break;
			case 4:
				cout << pup->getName() << " is sitting" << endl << endl;
				int sit;
				cout << "1. Pet" << endl;
				cout << "2. Quit" << endl;
				cin >> sit;

				switch(sit)
				{
				case 1:
					cout << "You pet " << pup->getName() << endl << endl;
					pup->setHunger(pup->getHunger()-0.5);
					pup->setHappiness(pup->getHappiness()-3);
					pup->setWeight(pup->getWeight()+0.002);
					break;
				case 2:
					break;
				}
			case 5:
				cout << pup->getName() << " is lying down" << endl << endl;
				pup->setHunger(pup->getHunger()-0.5);
				pup->setHappiness(pup->getHappiness()-3);
				pup->setWeight(pup->getWeight()+0.005);
				break;
			case 6:
				break;
			}
			break;
		case 3:
			system("CLS");
			break;
		case 4:
			isPlaying = false;
		}
	}while(isPlaying);

}