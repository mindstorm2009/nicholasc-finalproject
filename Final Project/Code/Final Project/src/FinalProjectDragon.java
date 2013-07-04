import java.util.Scanner;

public class FinalProjectDragon
{
	
	
	private static void wait(int milliseconds)
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
	
	
	
	public static void examineDog(Dog pup)
	{
		System.out.println(pup.getName());
		System.out.println(pup.getAge() + " years old");
		System.out.println(pup.getEnergyLevel() + " EnergyLevel");
		System.out.println(pup.getHappiness() + " happiness");
		System.out.println(pup.getHunger() + " hunger");
		System.out.println(pup.getWeight() + " lbs.");
		System.out.println(pup.getThirst() + " thirst" + "\n");
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		boolean isPlaying = true;
		System.out.println(Dog.pupImage());
		System.out.println("|=====================================================|");
		System.out.println("|          Welcome to Tamagachi: PC Version	      |");
		System.out.println("|                     Credits:			      |");
		System.out.println("|              Creator: Nicholas Curl		      |");
		System.out.println("|Code Help: My ID Programing Academy Instructor Dragon|");
		System.out.println("|=====================================================| ");
		System.out.println("The months are in decimal form using twelfths, for example 0.083 = 1 month"  + "\n");
		System.out.print("Do want to play or exit? (y/n): ");
		String askplay = input.nextLine();

		isPlaying = (askplay.equals("y"));
		if (!isPlaying)
		{
			input.close();
			return;
		}

		System.out.println("You recieve a puppy.  Please name the puppy");
		String pupname = input.nextLine();
		System.out.print("\n");
		
		
		if(pupname.equals("kappy"))
		{
			System.out.println("Kappy is the best" + "\n");
		}
		
		Dog pup = new Dog();
		pup.setAge(.083);
		pup.ageTimer.start();
		pup.setEnergyLevel(10);
		pup.setHappiness(100);
		pup.setWeight(10);
		pup.setHunger(100);
		pup.setName(pupname);
		pup.setThirst(100);		
		
		do
		{
			
			if(pup.getEnergyLevel() < 15)
			{
				System.out.println("Bark, Bark, Bark");
				System.out.println(pup.getName() + " is tired please put " + pup.getName() + " in bed");
				System.out.println("To put " + pup.getName() + " in bed please press 2 , then press Enter, then press 2, and then press Enter Again" + "\n");
			}

			if (pup.getHunger() < 15)
			{
				System.out.println("Bark, Bark, Bark");
				System.out.println(pup.getName() + " is hungry please feed " + pup.getName());
				System.out.println("To feed " + pup.getName() + " please press 2, then press Enter, then press 3, and then press Enter again" + "\n");
			}

			if (pup.getHappiness() < 15)
			{
				System.out.println("Bark, Bark, Bark");
				System.out.println(pup.getName() + " is lonely please play with " + pup.getName());
				System.out.println("To play with " + pup.getName() + " please press 2 , then press Enter, then press 1, and then press Enter again" + "\n");
			}
			
			if (pup.getHappiness() < 15)
			{
				System.out.println("Bark, Bark, Bark");
				System.out.println(pup.getName() + " is thirsty please give water to " + pup.getName());
				System.out.println("To give water to " + pup.getName() + " please press 2 , then press Enter, then press 1, and then press Enter again" + "\n");
			}
			

			System.out.println("1. Check on " + pup.getName());
			System.out.println("2. Interact with " + pup.getName());
			System.out.println("3. Quit");
			System.out.print("Please make a selection (1, 2, or 3): ");
			Integer selection = input.nextInt();
			System.out.print("\n");

			switch (selection)
			{
			case 1:
				examineDog(pup);
				break;
			case 2:
				System.out.println("1. Play with " + pup.getName());
				System.out.println("2. Make " + pup.getName() + " sleep");
				System.out.println("3. Feed " + pup.getName());
				System.out.println("4. Give water to " + pup.getName());
				System.out.println("5. Tricks");
				System.out.println("6. Quit");
				System.out.print("Please make a selection (1, 2, 3, 4, or 5): ");
				Integer interaction = input.nextInt();
				System.out.print("\n");

				switch (interaction)
				{
				case 1:
					System.out.println("1. Use a fisbee");
					System.out.println("2. Use a ball");
					System.out.println("3. Play tug of war with " + pup.getName());
					System.out.println("4. Throw a bone");
					System.out.println("5. Belly rub");
					System.out.print("Please make a selection (1, 2, 3, 4, or 5): ");
					Integer play = input.nextInt();
					System.out.print("\n");

					switch (play)
					{
					case 1:
						pup.fetchFrisbee();
						pup.setEnergyLevel(pup.getEnergyLevel() - 1);
						pup.setHunger(pup.getHunger() - 0.5);
						pup.setHappiness(pup.getHappiness() + 2.5);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 2:
						pup.fetchBall();
						pup.setEnergyLevel(pup.getEnergyLevel() - 1);
						pup.setHunger(pup.getHunger() - 0.5);
						pup.setHappiness(pup.getHappiness() + 2.5);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 3:
						pup.TugOfWar();
						pup.setEnergyLevel(pup.getEnergyLevel() - 2);
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3.5);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 4:
						pup.fetchBone();
						pup.setEnergyLevel(pup.getEnergyLevel() - 1);
						pup.setHunger(pup.getHunger() - 0.5);
						pup.setHappiness(pup.getHappiness() + 2.5);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 5:
						System.out.println("You give " + pup.getName() + " a good belly rub" + "\n");
						pup.setHunger(pup.getHunger() - 0.5);
						pup.setHappiness(pup.getHappiness() + 5);
						pup.setWeight(pup.getWeight() - 0.002);
						break;
					}
					break;
				case 2:
					pup.Sleep();
					pup.setEnergyLevel(pup.getEnergyLevel() + 100);
					pup.setHunger(pup.getHunger() - 0.5);
					pup.setWeight(pup.getWeight() - .002);
					pup.setHappiness(pup.getHappiness() - 1);
					break;
				case 3:
					pup.Eat();
					pup.setEnergyLevel(pup.getEnergyLevel() + 1);
					pup.setHunger(pup.getHunger() + 100);
					pup.setHappiness(pup.getHappiness() + 3);
					pup.setWeight(pup.getWeight() + 1);
					break;
				case 4:
					pup.Drinking();
					pup.setEnergyLevel(pup.getEnergyLevel() + 1);
					pup.setHunger(pup.getHunger() - 0.5);
					pup.setHappiness(pup.getHappiness() + 3);
					pup.setWeight(pup.getWeight() + 1);
					pup.setThirst(pup.getThirst() + 100);
					break;
				case 5:
					System.out.println("1. Command " + pup.getName() + " to sit");
					System.out.println("2. Command " + pup.getName() + " to lie down");
					System.out.println("3. Command " + pup.getName() + " to roll over");
					System.out.println("4. Command " + pup.getName() + " to high five");
					System.out.println("5. Command " + pup.getName() + " to jump");
					System.out.println("6. Command " + pup.getName() + " to shake");
					System.out.println("7. Command " + pup.getName() + " to spin");
					System.out.println("8. Command " + pup.getName() + " to sit pretty");
					System.out.println("9. Command " + pup.getName() + " to speak");
					System.out.println("10. Command " + pup.getName() + " to bow");
					System.out.println("11. Command " + pup.getName() + " to jump rope");
					System.out.println("12. Command " + pup.getName() + " to crawl");
					System.out.println("13. Command " + pup.getName() + " to play dead");
					System.out.println("14. Command " + pup.getName() + " to limp");
					System.out.println("15. Command " + pup.getName() + " to give you a kiss");
					System.out.println("16. Say bang to " + pup.getName());
					System.out.println("17. Quit");
					System.out.print("Please make a selection (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, or 17): ");
					Integer tricks = input.nextInt();
					System.out.print("\n");
					
					switch(tricks)
					{
					case 1:
						
						System.out.println(pup.getName() + " is sitting" + "\n");
						System.out.println("1. Pet");
						System.out.println("2. Quit");
						System.out.print("Please make a selection (1 or 2): ");
						Integer sit = input.nextInt();
						System.out.print("\n");
	
						switch (sit)
						{
						case 1:
							System.out.println("You pet " + pup.getName() + "\n");
							pup.setHunger(pup.getHunger() - 0.5);
							pup.setHappiness(pup.getHappiness() + 3);
							pup.setWeight(pup.getWeight() + 0.002);
							break;
						case 2:
							break;
						}
						break;
					case 2:
						System.out.println(pup.getName() + " is lying down" + "\n");
						pup.setHunger(pup.getHunger() - 0.5);
						pup.setHappiness(pup.getHappiness() - 3);
						pup.setWeight(pup.getWeight() + 0.005);
						break;
					case 3:
						pup.rollOver();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.05);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 4:
						pup.Jumping();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.05);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 5:
						System.out.println(pup.getName() + " gives you a high five and you give " + pup.getName() + " a treat" + "\n");
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 6:
						pup.Shaking();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 7:
						pup.Spinning();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.05);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 8:
						System.out.println(pup.getName() + " sits pretty and you give " + pup.getName() + " a treat" + "\n");
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 9:
						pup.Bark();
						pup.setHunger(pup.getHunger() - 0.5);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 10:
						System.out.println(pup.getName() + " bows and you give " + pup.getName()+ " a treat" + "\n");
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 11:
						pup.jumpingRope();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.05);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 12:
						pup.Crawling();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 13:
						pup.playDead();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 14:
						System.out.println(pup.getName() + " performs the limp trick and you give "+ pup.getName() + " a treat" + "\n");
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 15:
						System.out.println(pup.getName() + " gives you a kiss and you give "+ pup.getName() + " a treat" + "\n");
						pup.setHunger(pup.getHunger() - 0.002);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 0.5);
						break;
					case 16:
						pup.Bang();
						pup.setHunger(pup.getHunger() - 1);
						pup.setHappiness(pup.getHappiness() + 3);
						pup.setWeight(pup.getWeight() - 0.002);
						pup.setThirst(pup.getThirst() - 1);
						break;
					case 17:
						break;
					}
					break;
				case 6:
					break;
				}
				break;
			case 3:
				isPlaying = false;
			}
			
			
			if(pup.getAge()> 11)
			{
				System.out.println(pup.getName() + " has gone to heaven.\n");
				wait(2000);
				isPlaying = false;
			}
			
			
			if(pup.getHunger() == 0)
			{
				System.out.println(pup.getName() + " has gone to heaven.\n");
				wait(2000);
				isPlaying = false;
			}
			
			
			if(pup.getHappiness() == 0)
			{
				System.out.println(pup.getName() + " has run away");
				wait(2000);
				isPlaying = false;
			}
			
			if(pup.getThirst() == 0)
			{
				System.out.println(pup.getName() + " has gone to heaven." + "\n");
				wait(2000);
				isPlaying = false;
			}
			
		}
		while (isPlaying);
		
		input.close();

	}

}
