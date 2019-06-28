package fundamentals;
public class F8 {
	public static void main(String args[])
	{
		char a=args[0].charAt(0);
		if(a>=48 &&  a<=57)
		{
			System.out.println("digit");
		}
		else if((a>='a' &&  a<='z')||(a>='A' && a<='Z'))
		{
			System.out.println("alphabets");
		}
		else
		{
			System.out.println("sep char");
	}
}
}