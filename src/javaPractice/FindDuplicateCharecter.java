package javaPractice;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateCharecter {

	public static void main(String[] args) {
    
		String str="hellohi azad hello";
		int len=str.length();
		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
			hm.put(c, 1);
			}
		}
		//System.out.println(hm);
		Iterator<Character> tChar=hm.keySet().iterator();
		while(tChar.hasNext())
		{
			char temp=tChar.next();
			if(hm.get(temp)>1)
			{
				System.out.println("charecte "+temp+" present "+hm.get(temp)+" times");
			}
		}
	}

}
