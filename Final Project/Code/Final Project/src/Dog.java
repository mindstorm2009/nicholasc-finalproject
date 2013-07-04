import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Dog
{

	
	// time ages dog
	Timer ageTimer;

	// Initialize Variables
	private String name;
	private double weight, age, hunger, energyLevel, happiness, thirst;

	// Constructor and Destructor
	Dog()
	{
		name = "Dragon";
		age = 6;
		energyLevel = 20;
		weight = 100;
		happiness = 100;
		hunger = 100;
		thirst = 100;
		setupAgeTimer();
	}

	Dog(String newName, double newAge, double newEnergyLevel, double newWeight, double newHappiness, double newHunger, double newThirst)
	{
		name = newName;
		age = newAge;
		energyLevel = newEnergyLevel;
		weight = newWeight;
		happiness = newHappiness;
		thirst = newThirst;
		System.out.println("A new dog named " + name + " has been born");
		setupAgeTimer();
	}

	private void setupAgeTimer()
	{
		ageTimer = new Timer(25000, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pupdate();
			}
		});
	}
	
	private void pupdate()
	{
		age += 0.083;
		hunger -= 0.05;
		energyLevel -= 0.009;
		happiness -= 0.003;
		weight += 0.005;
		thirst -= 5;
	}
	
	public void Shaking()
	{
		System.out.println(name + " is shaking");
		wait(2000);
		System.out.println(name + "Stops shaking and you give " + name + " a treat" + "\n");
	}
	
	public void playDead()
	{
		System.out.println(name + " is playing dead");
		wait(2000);
		System.out.println(name + "Stops playing dead and you give " + name + " a treat" + "\n");
	}
	
	public void Bang()
	{
		System.out.println("You say the word bang to " + name);
		System.out.println(name + " limps, then crawls, and then plays dead");
		wait(2000);
		System.out.println(name + "Stops doing the bang trick and you give " + name + " a treat" + "\n");
	}
	
	public void rollOver()
	{
		System.out.println(name + " is rolling over");
		wait(2000);
		System.out.println(name + "Stops rolling over and you give " + name + " a treat");
	}
	
	public void Drinking()
	{
		System.out.println(name + " is drinking the water");
		wait(2000);
		System.out.println(name + " has finished drinking the water" + "\n");
	}
	
	public void Bark()
	{
		System.out.println(name + " is barking");
		wait(2000);
		System.out.println(name + " stops barking" + "\n");
	}
	
	public void fetchBone()
	{
		System.out.println("You throw a bone so " + name + " can fetch");
		wait(2000);
		System.out.println(name + " fetches the bone" + "\n");
	}
	
	public void fetchFrisbee()
	{
		System.out.println("You throw a frisbee so " + name + " can fetch");
		wait(2000);
		System.out.println(name + " fetches the frisbee" + "\n");
	}
	
	public void fetchBall()
	{
		System.out.println("You throw a ball so " + name + " can fetch");
		wait(2000);
		System.out.println(name + " fetches the ball" + "\n");
	}
	
	public void TugOfWar()
	{
		System.out.println("You pull on one side of the rope and " + name + " is pulling on the other");
		wait(2000);
		Random rand = new Random();
		int x = rand.nextInt(10);
		
		if(x < 5)
		{
			System.out.println(name + " wins the tug of war" + "\n");
		}
		
		if(x >= 5)
		{
			System.out.println("You win the tug of war" + "\n");
		}
	}
	
	public void Jumping()
	{
		System.out.println(name + " is jumping");
		wait(2000);
		System.out.println(name + "Stops jumping and you give " + name + " a treat" + "\n");
	}
	
	public void jumpingRope()
	{
		System.out.println(name + " is jumping rope");
		wait(2000);
		System.out.println(name + " stops jumping rope and you give " + name + " a treat" + "\n");
	}

	public void Spinning()
	{
		System.out.println(name + " is spinning");
		wait(2000);
		System.out.println(name + " stops spinning and you give " + name + " a treat" + "\n");
	}
	
	public void Crawling()
	{
		System.out.println(name + " is crawling");
		wait(2000);
		System.out.println(name + " stops crawling" + "\n");
	}
	
	public void Eat()
	{
		System.out.println(name + " is eating.");
		wait(2000);
		System.out.println(name + " is finished eating." + "\n");
	}

	public void Sleep()
	{
		System.out.println(name + " is sleeping.");
		wait(2000);
		System.out.println(name + " is awake." + "\n");
	}
	
	private void wait(int milliseconds)
	{
		try
		{
			Thread.sleep(milliseconds);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void Sit()
	{
		System.out.println(name + " is sitting");
		energyLevel += 5;
		happiness += 10;
		hunger -= 0.5;
	}

	void LieDown()
	{
		System.out.println(name + " is lying down");
		energyLevel -= 5;
		weight += 2;
		happiness -= 10;
		hunger -= 1;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String D)
	{

		name = D;
	}

	public double getHappiness()
	{
		return happiness;
	}

	public void setHappiness(double A)
	{

		if (A < 101)
		{
			happiness = A;
		}
		else
		{
			happiness = 100;
		}
		if( A < 0)
		{
			happiness = 0;
		}
		
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double F)
	{

		weight = F;
	}

	public double getAge()
	{
		return age;
	}

	public void setAge(double E)
	{

		age = E;
	}

	public double getHunger()
	{
		return hunger;
	}

	public void setHunger(double C)
	{
		if (C < 101)
		{
			hunger = C;
		}
		else
		{
			hunger = 100;
		}
		
		if (C < 0)
		{
			hunger = 0;
		}
	}

	public double getThirst()
	{
		return thirst;
	}

	public void setThirst(double G)
	{
		if (G < 101)
		{
			thirst = G;
		}
		else
		{
			thirst = 100;
		}
		if(G < 0)
		{
			thirst = 0;
		}
	}
	
	public double getEnergyLevel()
	{
		return energyLevel;
	}
	
	public void setEnergyLevel(double B)
	{
		if (B < 101)
		{
			energyLevel = B;
		}
		else
		{
			energyLevel = 100;
		}
		
		if (B < 0)
		{
			energyLevel = 0;
		}
		
	}
	public static String pupImage()
	{
		String pup = " ,               -----,    " + "\n"
				+ "((              /( ) ' `-o" + "\n"
				+ "\\\\_,----------/      .__/ " + "\n"
				+ "  |                  /    " + "\n"
				+ "  (        __       ,'    " + "\n"
				+ "   \\      )   '___\\ \\\\    " + "\n"
				+ "    ) , '(         ` ))   " + "\n"
				+ "   < ( `•\\_       / //    " + "\n"
				+ "    `•\\_ `''      '''     " + "\n"
				+ "      `''                  " + "\n";
		return pup;
	}
}
