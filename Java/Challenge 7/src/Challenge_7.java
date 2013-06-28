import java.util.*;


public class Challenge_7 {
	public static void main(String[] args) {
		ArrayList <Integer> list1 = new ArrayList<Integer>();
		ArrayList <Integer> list2 = new ArrayList<Integer>();
		
		while(list1.size() <= 5)
		{
			Random rand = new Random();
			int x =rand.nextInt();
			list1.add(x);
			System.out.println(list1);
		}
		
		while(list2.size() <= 5)
		{
			Random rand = new Random();
			int y =rand.nextInt();
			list2.add(y);
			System.out.println(list2);
			
		}
		int min1 = 0;
		int max1 = 0;
		for(int i = 0; i < list1.size(); i++)
		{
			min1 = Integer.MAX_VALUE;
			if(list1.get(i) < min1)
			{
				min1 = list1.get(i);
			}
			max1 = Integer.MIN_VALUE;
			if(list1.get(i) > max1)
			{
				max1 = list1.get(i);
			}
		}
		int min2 = 0;
		int max2 = 0;
		for(int h = 0; h < list2.size(); h++)
		{
			min2 = Integer.MAX_VALUE;
			if(list2.get(h) < min2)
			{
				min2 = list2.get(h);
			}
			max2 = Integer.MIN_VALUE;
			if(list2.get(h) > max2)
			{
				max2 = list2.get(h);
			}
		}
		System.out.println(min1);
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(min2);

	}

}
