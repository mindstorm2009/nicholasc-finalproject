#include "Dog.h"

void main()
{
	//Dog DefaultDog;
	Dog Madeline("Madeline", 11, 30, 80, 100);
	
	cout << Madeline.age << endl;
	cout << Madeline.energyLevel << endl;
	cout << Madeline.name << endl;
	cout << Madeline.weight << endl;
	cout << Madeline.happiness << endl;

	
		for(int i = 0; i<20; i++)
		{
			cout << "time playing " <<i << endl;
			cout  << Madeline.name << "'s energy level is:" << Madeline.energyLevel << endl;
			if(Madeline.energyLevel == 15)
			{
				Madeline.Bark();
				Madeline.Bark();
				Madeline.Bark();
				Madeline.Bark();
				Madeline.Bark();
			}
			Madeline.energyLevel --;
		}

	
	/*cout << DefaultDog.age << endl;
	cout << DefaultDog.energyLevel << endl;
	cout << DefaultDog.name << endl;
	cout << DefaultDog.weight << endl;
	cout << DefaultDog.happiness << endl;

	DefaultDog.~Dog();
	*/
	system("pause");
}