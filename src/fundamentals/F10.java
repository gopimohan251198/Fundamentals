package fundamentals;
import java.util.*;
public class F10 {
	public static void main(String args[])
	{
		int i,a;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		a=str.length();
		for(i=0;i<a;i++)
		{
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(Character.isLowerCase(ch));
			else
				System.out.print(Character.isUpperCase(ch));
		}
	
		
}
}