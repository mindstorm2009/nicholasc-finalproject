#include <iostream>
#include <string>
using namespace std;

class Dog
{
	public:
		//Initialize Variables
		string name;
		int energyLevel, happiness;
		double weight, age, hunger;

		//Constructor and Destructor
		Dog();
		Dog(string newName, double newAge, int newEnergyLevel, double newWeight, int newHappieness, double newHunger);
		~Dog();

		void Bark();
		void Eat();
		void Sleep();
		void Sit();
		void LieDown();

		void setHappiness(int A);
		void setEnergy(int B);
		void setHunger(int C);
};

