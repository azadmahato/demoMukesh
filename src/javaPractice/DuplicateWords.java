package javaPractice;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWords {

	public static void main(String[] args) {
    
		String str=" i am am learning java java ";
		HashMap<String, Integer> hm=new HashMap<>();
		String[] s=str.split(" ");
		for(String tempString:s)
		{
			if(hm.get(tempString)!=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}
			else
			{
			hm.put(tempString, 1);
			}
		}
		Iterator<String> tString=hm.keySet().iterator();
		while(tString.hasNext())
		{
			String temp=tString.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the word "+temp+" presennt "+hm.get(temp)+" times");
			}
		}
	}

}
