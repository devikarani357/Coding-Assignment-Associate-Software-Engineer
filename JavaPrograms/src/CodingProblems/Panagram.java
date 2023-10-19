package CodingProblems;
import java.util.*;
public class Panagram {
	public static void main(String[] args)
	{
		System.out.println("enter the string of your choice");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Map<Character,Integer>m=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			m.put(c,m.getOrDefault(c,0)+1);
		}
		if(m.size()==26)
		{
			System.out.println("The given string is Panagram");
		}
		else
		{
			System.out.println("Not a panagram");
		}
	}

}
