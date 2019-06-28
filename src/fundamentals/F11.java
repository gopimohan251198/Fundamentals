package fundamentals;

public class F11 {
	public static void main(String args[])
	{
		char color=args[0].charAt(0); 
		switch(color)
		{
		case 'G':
			System.out.println("Green");
			break;
		case 'R':
			System.out.println("Red");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("white");
			break;
		default:
			System.out.println("invalid color");
			break;
			
		}
		
}
}