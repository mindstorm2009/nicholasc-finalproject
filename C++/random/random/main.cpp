#include <iostream>
#include <cmath>
#include <string>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

using namespace std;


int randInt(int min,int max)
{
        return rand() % (max - 1) + min;
}


struct character{
        int strength, defense;
        string name;
};

character user, comp;

void main(){
         srand(time(NULL));
         user.strength = randInt(1,20);
         comp.strength = randInt(1,20);
         user.defense = randInt(1,20);
         comp.defense = randInt(1,20);

         cout << user.strength << endl << user.defense << endl << comp.strength << endl << comp.defense << endl;
         system("pause");
}