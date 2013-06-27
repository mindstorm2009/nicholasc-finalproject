#include <iostream>
#include <string>
using namespace std;

class Dog
{
	public:
		//Initialize Variables
		string name;
		int energyLevel, happiness, hunger;
		double weight, age;

		//Constructor and Destructor
		Dog();
		Dog(string newName, double newAge, int newEnergyLevel, double newWeight, int newHappieness, int newHunger);
		~Dog();

		void Bark();
		void Eat();
		void Sleep();
		void Sit();
		void LieDown();

		void setHappiness(int A);
		void setEnergy(int B);
};

