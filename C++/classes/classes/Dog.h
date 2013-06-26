#include <iostream>
#include <string>
using namespace std;

class Dog
{
	public:
		//Initialize Variables
		string name;
		int age, energyLevel, happiness;
		double weight;

		//Constructor and Destructor
		Dog();
		Dog(string newName, int newAge, int newEnergyLevel, double newWeight, int newHappieness);
		~Dog();

		void Bark();
		void Eat();
		void Sleep();
		void Sit();
		void LieDown();
};

