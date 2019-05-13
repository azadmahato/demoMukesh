package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String s = "The color of the color is color";
               char[] ch=s.toCharArray();
               Set s1=new HashSet();
               for(Character charc:ch)
               {
            	   if(!s1.add(charc))
            	   {
            		   System.out.println("the duplicate charecter is "+charc);
            	   }

               }

		}
	}


