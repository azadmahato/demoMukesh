package javaPractice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExm {

	public static void main(String[] args) {
    
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {
			Integer object = (Integer) e.nextElement();
			if(object%2==0)
				System.out.print(" "+object);
			
		}
	}

}
