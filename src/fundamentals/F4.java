package fundamentals;

public class F4 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a<0)
			System.out.println("neg");
		else if(a>0)
			System.out.println("pos");
		else
			System.out.println("zero");
	}
}
