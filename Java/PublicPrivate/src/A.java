import java.util.*;
public class A{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try
		{
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		String[] arr = new String[50];
		while(true)
		{
			String item = input.nextLine();
			arr[arr.length -1] = item;
			String [] arr2 = new String[arr.length + 1];
			for(int i = 0; i < arr.length; i++)
			{
				arr2[i] = arr[i];
			}
			arr = arr2;
			System.out.println(arr);
		}
	}

}
