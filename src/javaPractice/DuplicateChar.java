package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
     
		String s0="programmming";
		String s=s0.replace(" ", "");
		Set<Character> c=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			Character ch=s.charAt(i);
			if(c.contains(ch))
			{
				System.out.println(ch);
			}
			else
			{
				c.add(ch);
			}
		}
				
	}

}
