
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		int x;
		int y = 999999999;
		x = y;
		System.out.println(x);
		String name = "Nicholas";
		
		//functions
		int z = add(999999999,999999999);
		System.out.println(z);
		File newFile = new File("text");
		System.out.println(newFile.getFileName());
	}
	// functions
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	
}
