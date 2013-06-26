#include "Dog.h"


Dog::Dog()
{
	name = "Default Dog";
	age = 6;
	energyLevel = 20;
	weight = 100;
	happiness = 100;
	cout << name << " has been born." <<endl;
}
Dog::Dog(string newName, int newAge, int newEnergyLevel, double newWeight, int newHappiness)
{
	name = newName;
	age = newAge;
	energyLevel = newEnergyLevel;
	weight = newWeight;
	happiness = newHappiness;
	cout << "A new dog named " << name << " has been born" << endl;
}

void Dog::Bark()
{
	cout << name << " is barking!" << endl;
	happiness += 5;
}
void Dog::Eat()
{
	cout << name << " is eating." <<endl;
	energyLevel += 1;
	weight += 0.5;
}
void Dog::Sleep()
{
	cout << name << " is sleeping" << endl;
	energyLevel += 10;
	weight -= 1;
}
void Dog::Sit()
{
	cout << name << " is sitting" << endl;
	energyLevel += 5;
	happiness += 10;
}
void Dog::LieDown()
{
	cout << name << " is lying down" << endl;
	energyLevel -= 5;
	weight += 2;
	happiness -= 10;
}
Dog::~Dog()
{
	age = 0;
	energyLevel = 0;
	weight = 0;
	happiness = 0;
	cout << name << " went to heaven" << endl;
}
