import java.util.Scanner;

/**
 * 
 * @author Akul Patel
 * Birthday Calculator
 *
 */
public class BirthdayCalculator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the birthday of the first person:");
		System.out.print("\tYear: ");
		int person1Year = keyboard.nextInt();
		System.out.print("\tMonth (in numerical format): ");
		int person1Month = keyboard.nextInt();
		System.out.print("\tDay: ");
		int person1Day= keyboard.nextInt();
		
		System.out.println("\nPlease enter the birthday of the second person:");
		System.out.print("\tYear: ");
		int person2Year = keyboard.nextInt();
		System.out.print("\tMonth (in numerical format): ");
		int person2Month = keyboard.nextInt();
		System.out.print("\tDay: ");
		int person2Day= keyboard.nextInt();
		
		if(person1Year<person2Year)
		{
			System.out.print("\nPerson 1 is older.");
		}
		else if(person1Year>person2Year)
		{
			System.out.print("\nPerson 2 is older.");
		}
		else
		{
			if(person1Month<person2Month)
			{
				System.out.print("\nPerson 1 is older.");
			}
			else if(person1Month>person2Month)
			{
				System.out.print("\nPerson 2 is older.");
			}
			else
			{
				if(person1Day<person2Day)
				{
					System.out.print("\nPerson 1 is older.");
				}
				else if(person1Day>person2Day)
				{
					System.out.print("\nPerson 2 is older.");
				}
				else
				{
					System.out.print("\nPerson 1 and 2 are both the same age.");
				}

			}
		}

	}
		
}