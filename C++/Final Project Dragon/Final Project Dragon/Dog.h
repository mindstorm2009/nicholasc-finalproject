#include <iostream>
#include <string>
using namespace std;

class Dog
{
private:
		//Initialize Variables
		string name;
		int happiness;
		double weight, age, hunger, energyLevel;
	public:
		//Constructor and Destructor
		Dog();
		Dog(string newName, double newAge, double newEnergyLevel, double newWeight, int newHappieness, double newHunger);
		~Dog();

		void Bark();
		void Eat();
		void Sleep();
		void Sit();
		void LieDown();

		int getHappiness();
		double getWeight();
		double getAge();
		double getHunger();
		double getEnergy();
		string getName();
		void setHappiness(int A);
		void setEnergy(double B);
		void setHunger(double C);
		void setName(string D);
		void setAge(double E);
		void setWeight(double F);
};

