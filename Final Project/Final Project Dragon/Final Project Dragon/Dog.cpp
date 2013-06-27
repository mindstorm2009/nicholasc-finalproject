#include "Dog.h"


Dog::Dog()
{
	name = "Dragon";
	age = 6;
	energyLevel = 20;
	weight = 100;
	happiness = 100;
	hunger = 100;
	cout << name << " has been born." <<endl;
}
Dog::Dog(string newName, double newAge, int newEnergyLevel, double newWeight, int newHappiness, double newHunger)
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
	hunger -= 0.5;
}
void Dog::Eat()
{
	cout << name << " is eating." <<endl;
	energyLevel += 1;
	weight += 0.5;
	hunger += 100;
	
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
	hunger -= 0.5;
}
void Dog::LieDown()
{
	cout << name << " is lying down" << endl;
	energyLevel -= 5;
	weight += 2;
	happiness -= 10;
	hunger -= 1;
}
void Dog::setHappiness(int A)
{
	if(A < 101)
	{
		happiness = A;
	}
	else
	{
		happiness = 100;
	}
}
void Dog::setEnergy(int B)
{
	if(B < 101)
	{
		energyLevel = B;
	}
	else
	{
		energyLevel = 100;
	}
}
void Dog::setHunger(int C)
{
	if(C < 101)
	{
		energyLevel = C;
	}
	else
	{
		hunger = 100;
	}
}
Dog::~Dog()
{
	age = 0;
	energyLevel = 0;
	weight = 0;
	happiness = 0;
	cout << name << " went to heaven" << endl;
}
